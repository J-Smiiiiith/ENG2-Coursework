package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.CustomerDTO;
import uk.ac.york.eng2.orders.dto.OrderItemDTO;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.gateways.ProductManagementClientApi;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@MicronautTest(transactional = false)
public class OrderItemControllerTest {

    @Inject
    OrderItemClient orderItemClient;

    @Inject
    OrdersClient ordersClient;

    @Inject
    CustomerClient customerClient;

    @Inject
    OrderItemRepository orderItemRepo;

    @Inject
    OrdersRepository ordersRepo;

    @Inject
    CustomerRepository customerRepo;

    @BeforeEach
    void setup() {
        orderItemRepo.deleteAll();
        ordersRepo.deleteAll();
        customerRepo.deleteAll();
    }

    @MockBean(ProductManagementClientApi.class)
    protected ProductManagementClientApi getProductManagementClientMock() {
        Map<Long, Integer> products1 = new HashMap<>();
        products1.put(1L, 5);

        Map<Long, Integer> products2 = new HashMap<>();
        products2.put(1L, 5);
        products2.put(2L, 5);

        ProductManagementClientApi mock = mock(ProductManagementClientApi.class);
        when(mock.getProductUnitPrice(anyLong()))
                .thenReturn(1.56F);
        when(mock.checkProductsValidity(products1))
                .thenReturn(Map.of("Valid Products", Map.of(1L, 5)));
        when(mock.checkProductsValidity(products2))
                .thenReturn(Map.of("Valid Products", Map.of(1L, 5, 2L, 5)));
        when(mock.getProductsPrice(anyMap()))
                .thenReturn(10F);
        return mock;
    }

    @Test
    public void noOrderItemsTest() {
        assertEquals(0, orderItemClient.getOrderItems().size());
    }

    @Test
    public void createOrderItemOnOrderCreationTest() {
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        long customerId = createCustomer("example");
        long orderId = createOrders("123 Test St", products, customerId);
        Orders createdOrder = ordersClient.getOrder(orderId);

        assertEquals(1, orderItemClient.getOrderItems().size());
    }

    @Test
    public void getOrderItemsTest() {
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        products.put(2L, 5);
        long customerId = createCustomer("example");
        long orderId = createOrders("123 Test St", products, customerId);

        assertEquals(2, orderItemClient.getOrderItems().size());
    }

    @Test
    public void getOrderItemByIdTest() {
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        long customerId = createCustomer("example");
        long orderId = createOrders("123 Test St", products, customerId);
        Orders createdOrder = ordersClient.getOrder(orderId);

        long orderItemId = createOrderItem(createdOrder, 1L, 5);
        OrderItem orderItem = orderItemClient.getOrderItem(orderItemId);

        assertEquals(orderItemId, orderItem.getId());
        assertEquals(1L, orderItem.getProductId());
        assertEquals(5, orderItem.getQuantity());
        assertEquals(createdOrder.getId(), orderItem.getOrder().getId());
    }

    private long createOrderItem(Orders order, long productId, int quantity) {
        OrderItemDTO dto = new OrderItemDTO();
        dto.setProductId(productId);
        dto.setQuantity(quantity);
        dto.setOrderId(order);
        HttpResponse<Void> res = orderItemClient.createOrderItem(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private long createOrders(String address, Map<Long, Integer> products, long customerId) {
        OrdersCreateDTO dto = new OrdersCreateDTO();
        dto.setAddress(address);
        dto.setProducts(products);
        dto.setCustomerId(customerId);
        HttpResponse<Void> res = ordersClient.createOrders(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private long createCustomer(String email) {
        CustomerDTO dto = new CustomerDTO();
        dto.setEmail(email);
        dto.setFirstName("fName");
        dto.setFamilyName("lName");
        HttpResponse<Void> res = customerClient.createCustomer(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
