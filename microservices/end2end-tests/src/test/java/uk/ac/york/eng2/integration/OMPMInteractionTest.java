package uk.ac.york.eng2.integration;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.cs.eng2.orders.order_management.model.CustomerDTO;
import uk.ac.york.cs.eng2.orders.order_management.model.OrderItem;
import uk.ac.york.cs.eng2.orders.order_management.model.Orders;
import uk.ac.york.cs.eng2.orders.order_management.model.OrdersCreateDTO;
import uk.ac.york.cs.eng2.orders.product_management.api.OrdersByDayApi;
import uk.ac.york.cs.eng2.orders.product_management.api.ProductsApi;
import uk.ac.york.cs.eng2.orders.order_management.api.CustomersApi;
import uk.ac.york.cs.eng2.orders.order_management.api.OrderItemsApi;
import uk.ac.york.cs.eng2.orders.order_management.api.OrdersApi;
import uk.ac.york.cs.eng2.orders.product_management.model.OrdersByDay;
import uk.ac.york.cs.eng2.orders.product_management.model.ProductDTO;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.awaitility.Awaitility.await;

@MicronautTest
public class OMPMInteractionTest {
    @Inject
    OrdersByDayApi ordersByDayApi;

    @Inject
    ProductsApi productsApi;

    @Inject
    CustomersApi customersApi;

    @Inject
    OrderItemsApi orderItemsApi;

    @Inject
    OrdersApi ordersApi;

    @Test
    public void testOM_PM_Interaction() {
        //Create various products for an order.
        long product1Id = createProduct("Product 1", 10.0f);
        long product2Id = createProduct("Product 2", 20.0f);

        // Create a customer for an order
        long customerId = createCustomer("example@email.com");

        // Create an order with the products and customer
        Map<Long, Integer> products = new HashMap<>();
        products.put(product1Id, 2);
        products.put(product2Id, 3);
        products.put(3L, 1);

        HttpResponse<Void> orderCreateResponse = createOrders("Test", products, customerId);

        // Check order was created
        assertEquals(HttpStatus.CREATED, orderCreateResponse.status());

        List<OrderItem> orderItems = orderItemsApi.getOrderItems().body();

        // When creating order, OM calls PM to check if products are valid. Check this call was successful
        // by checking which products were put into the OrderItems table.

        assertEquals(2, orderItems.size());
        assertEquals(product1Id, orderItems.get(0).getProductId());
        assertEquals(2, orderItems.get(0).getQuantity());
        assertEquals(product2Id, orderItems.get(1).getProductId());
        assertEquals(3, orderItems.get(1).getQuantity());

        // When creating order, OM calls PM to get the total price of the order. Check this call was
        // successful by checking the total price of the order.

        long createdOrderId = Long.parseLong(orderCreateResponse.header(HttpHeaders.LOCATION).split("/")[2]);
        Orders order = ordersApi.getOrder(createdOrderId).body();

        float expectedPrice = productsApi.getProductsPrice(convertProductMap(products)).body();
        float actualPrice = order.getTotalAmount();
        assertEquals(expectedPrice, actualPrice);

        // When creating orderItem, OM calls PM to get the unit price of the product. Check this call was
        // successful by checking the unit price of each orderItem.

        assertEquals(productsApi.getProductUnitPrice(product1Id).body(), orderItems.get(0).getUnitPrice());
        assertEquals(productsApi.getProductUnitPrice(product2Id).body(), orderItems.get(1).getUnitPrice());

        // Once an order has been created, OM produces a kafka record that PM will consume. This is used by
        // the PM consumer to update the OrdersVyDay table. Check that this was successful by checking
        // the OrdersByDay table.

        await().atMost(Duration.ofSeconds(20)).until(checkOrdersByTableCorrect(product1Id, product2Id));
    }

    private Callable<Boolean> checkOrdersByTableCorrect(long prodId1, long prodId2) {
        List<OrdersByDay> ordersByDay = ordersByDayApi.getOrdersByDay().body();
        if ((ordersByDay.size() == 2) &&
                (ordersByDay.get(0).getProduct().getId() == prodId1) &&
                (ordersByDay.get(1).getProduct().getId() == prodId2) &&
                (ordersByDay.get(0).getCount() == 2) &&
                (ordersByDay.get(1).getCount() == 3)) {
            return () -> true;
        } else {
            return () -> false;
        }
    }

    private long createProduct(String name, float unitPrice) {
        ProductDTO dto = new ProductDTO();
        dto.setName(name);
        dto.setUnitPrice(unitPrice);
        HttpResponse<Void> res = productsApi.createProduct(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private long createCustomer(String email) {
        CustomerDTO dto = new CustomerDTO();
        dto.setEmail(email);
        dto.setFirstName("fName");
        dto.setFamilyName("lName");
        HttpResponse<Void> res = customersApi.createCustomer(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private HttpResponse<Void> createOrders(String address, Map<Long, Integer> products, long customerId) {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress(address);
        dto.setProducts(convertProductMap(products));
        dto.setCustomerId(customerId);
        return ordersApi.createOrders(dto);
    }

    private Map<String, Integer> convertProductMap(Map<Long, Integer> products) {
        Map<String, Integer> convertedMap = new HashMap<>();
        for (Long key : products.keySet()) {
            convertedMap.put(key.toString(), products.get(key));
        }
        return convertedMap;
    }

}
