package uk.ac.york.eng2.products;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(transactional = false)
public class OrdersByDayControllerTest {
    @Inject
    OrdersByDayClient client;

    @Inject
    OrdersByDayRepository OrdersRepo;

    @Inject
    ProductRepository prodRepo;

    @BeforeEach
    void setup() {
        OrdersRepo.deleteAll();
    }

    @Test
    public void noOrdersByDayTest() {
        assertEquals(0, client.getOrdersByDay().size());
    }

    @Test
    public void createOrdersByDayTest() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(1.99f);
        prodRepo.save(product);
        long id = createOrdersByDay("2023-10-01", 5, product);
        assertEquals(1, client.getOrdersByDay().size());
    }

    @Test
    public void getAllOrdersByDayTest() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(1.99f);
        prodRepo.save(product);
        String day1 = "2023-10-01";
        String day2 = "2023-10-02";
        int count = 5;

        long id1 = createOrdersByDay(day1, count, product);
        long id2 = createOrdersByDay(day2, count, product);
        assertEquals(2, client.getOrdersByDay().size());
    }

    @Test
    public void getOrdersByDayTest() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(1.99f);
        prodRepo.save(product);
        String day = "2023-10-01";
        int count = 5;

        long id = createOrdersByDay(day, count, product);
        OrdersByDay createdOrder = client.getOrdersByDay(id);

        assertNotNull(createdOrder);
        assertEquals(day, createdOrder.getDay());
        assertEquals(count, createdOrder.getCount());
        assertEquals(id, createdOrder.getId());
    }

    @Test
    public void updateOrdersByDayDayTest() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(1.99f);
        prodRepo.save(product);
        String day = "2023-10-01";
        String updatedDay = "2023-10-02";
        int count = 5;

        long id = createOrdersByDay(day, count, product);
        OrdersByDay createdOrder = client.getOrdersByDay(id);
        assertEquals(day, createdOrder.getDay());

        OrdersByDayDTO dto = new OrdersByDayDTO();
        dto.setDay(updatedDay);
        client.updateOrdersByDay(id, dto);

        OrdersByDay updatedOrder = client.getOrdersByDay(id);
        assertEquals(updatedDay, updatedOrder.getDay());
        assertEquals(id, updatedOrder.getId());
    }

    @Test
    public void updateOrdersByDayCountTest() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(1.99f);
        prodRepo.save(product);
        String day = "2023-10-01";
        int count = 5;
        int updatedCount = 10;

        long id = createOrdersByDay(day, count, product);
        OrdersByDay createdOrder = client.getOrdersByDay(id);
        assertEquals(count, createdOrder.getCount());

        OrdersByDayDTO dto = new OrdersByDayDTO();
        dto.setCount(updatedCount);
        client.updateOrdersByDay(id, dto);

        OrdersByDay updatedOrder = client.getOrdersByDay(id);
        assertEquals(updatedCount, updatedOrder.getCount());
        assertEquals(id, updatedOrder.getId());
    }

    @Test
    public void deleteOrdersByDayTest() {
        Product product = new Product();
        product.setName("Test Product");
        product.setUnitPrice(1.99f);
        prodRepo.save(product);
        String day = "2023-10-01";
        int count = 5;

        long id = createOrdersByDay(day, count, product);
        assertEquals(1, client.getOrdersByDay().size());

        client.deleteOrdersByDay(id);
        assertEquals(0, client.getOrdersByDay().size());
    }

    private long createOrdersByDay(String day, int count, Product product) {
        OrdersByDayDTO dto = new OrdersByDayDTO();
        dto.setDay(day);
        dto.setCount(count);
        dto.setProduct(product);
        HttpResponse<Void> res = client.createOrdersByDay(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
