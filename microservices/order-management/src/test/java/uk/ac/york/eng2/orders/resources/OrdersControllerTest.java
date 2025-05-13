package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.CustomerDTO;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.dto.OrdersDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class OrdersControllerTest {

    @Inject
    OrdersClient ordersClient;

    @Inject
    CustomerClient customerClient;

    @Inject
    OrdersRepository ordersRepo;

    @Inject
    CustomerRepository customerRepo;

    @BeforeEach
    void setup() {
        ordersRepo.deleteAll();
        customerRepo.deleteAll();
    }

    @Test
    public void noOrdersTest() {
        assertEquals(0, ordersClient.getOrders().size());
    }

    @Test
    public void createOrderTest() {
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        products.put(2L, 10);
        products.put(3L, 3);
        products.put(4L, 7);
        long id = createOrders("Example Address", products, createCustomer("example@email.com"));
        assertEquals(1, ordersClient.getOrders().size());
    }

    @Test
    public void getOrderTest() {
        String address = "Example Address";
        long customerId = createCustomer("example@email.com");
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        products.put(2L, 10);
        products.put(3L, 3);
        products.put(4L, 7);

        long id = createOrders(address, products, customerId);
        Orders createdOrders = ordersClient.getOrder(id);

        assertNotNull(createdOrders);
        assertEquals(address, createdOrders.getAddress());
        assertEquals(customerId, createdOrders.getCustomer().getId());
        assertEquals(LocalDate.now().toString(), createdOrders.getDateCreated());
        assertFalse(createdOrders.isPaid());
        assertFalse(createdOrders.isDelivered());
        assertEquals(id, createdOrders.getId());
    }

    @Test
    public void getOrdersTest() {
        String address = "Example Address";
        long customerId = createCustomer("example@email.com");
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        products.put(2L, 10);
        products.put(3L, 3);
        products.put(4L, 7);

        long id1 = createOrders(address, products, customerId);
        long id2 = createOrders(address, products, customerId);
        assertEquals(2, ordersClient.getOrders().size());
    }

    @Test
    public void updateOrdersTest() {
        String address = "Example Address";
        String updatedAddress = "Updated Address";
        long customerId = createCustomer("example@email.com");
        long updatedCustomerId = createCustomer("example2@email.com");
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        products.put(2L, 10);
        products.put(3L, 3);
        products.put(4L, 7);

        long id = createOrders(address, products, customerId);
        Orders createdOrders = ordersClient.getOrder(id);
        assertEquals(address, createdOrders.getAddress());

        OrdersDTO dto = new OrdersDTO();
        dto.setAddress(updatedAddress);
        dto.setCustomerId(updatedCustomerId);
        dto.setPaid(true);
        dto.setDelivered(true);
        ordersClient.updateOrders(id, dto);
        Orders updatedOrders = ordersClient.getOrder(id);
        assertEquals(updatedAddress, updatedOrders.getAddress());
        assertEquals(updatedCustomerId, updatedOrders.getCustomer().getId());
        assertTrue(updatedOrders.isPaid());
        assertTrue(updatedOrders.isDelivered());
        assertEquals(id, updatedOrders.getId());
    }

    @Test
    public void deleteOrdersTest() {
        String address = "Example Address";
        long customerId = createCustomer("example@email.com");
        Map<Long, Integer> products = new HashMap<>();
        products.put(1L, 5);
        products.put(2L, 10);
        products.put(3L, 3);
        products.put(4L, 7);

        long id = createOrders(address, products, customerId);
        assertEquals(1, ordersClient.getOrders().size());

        ordersClient.deleteOrders(id);
        assertEquals(0, ordersClient.getOrders().size());
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
