package uk.ac.york.eng2.orders.events;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.CustomerDTO;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.gateways.ProductManagementClientApi;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;
import uk.ac.york.eng2.orders.resources.CustomerClient;
import uk.ac.york.eng2.orders.resources.OrdersClient;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@MicronautTest
public class OrdersByDayProducerTest {
    @Inject
    OrdersClient ordersClient;

    @Inject
    CustomerClient customerClient;

    @Inject
    OrdersRepository ordersRepo;

    @Inject
    CustomerRepository customerRepo;

    @Inject
    OrdersByDayProducer producer;

    @BeforeEach
    void setup() {
        ordersRepo.deleteAll();
        customerRepo.deleteAll();
    }

    @MockBean(OrdersByDayProducer.class)
    protected OrdersByDayProducer getProducerMock() {
        return mock(OrdersByDayProducer.class);
    }

    @MockBean(ProductManagementClientApi.class)
    protected ProductManagementClientApi getProductManagementValidProductsMock() {
        ProductManagementClientApi mock = mock(ProductManagementClientApi.class);
        when(mock.checkProductsValidity(anyMap()))
                .thenReturn(Map.of("Valid Products", Map.of(1L, 5)));
        when(mock.getProductsPrice(anyMap()))
                .thenReturn(10F);
        return mock;
    }

    @Test
    public void testOrdersByDayProducer() {
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        long id = createOrder("Example Address", products, createCustomer("example@email.com"));

        Orders createdOrder = ordersClient.getOrder(id);
        verify(producer).orderPlaced(eq(id),
                argThat(record ->
                            record.productId() == 1L &&
                            record.day().equals(createdOrder.getDateCreated()) &&
                            record.quantity() == 5)
        );
    }

    private long createOrder(String address, Map<Long, Integer> products, long customerId) {
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
