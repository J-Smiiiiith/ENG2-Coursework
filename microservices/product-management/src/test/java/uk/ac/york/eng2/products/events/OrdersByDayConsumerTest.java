package uk.ac.york.eng2.products.events;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayDTO;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;
import uk.ac.york.eng2.products.resources.OrdersByDayClient;
import uk.ac.york.eng2.products.resources.ProductClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class OrdersByDayConsumerTest {
    @Inject
    OrdersByDayConsumer consumer;

    @Inject
    OrdersByDayRepository OBDRepo;

    @Inject
    ProductRepository prodRepo;

    @Inject
    ProductTagRepository prodTagRepo;

    @Inject
    OrdersByDayClient OBDClient;

    @Inject
    ProductClient prodClient;

    @BeforeEach
    void setup() {
        prodTagRepo.deleteAll();
        OBDRepo.deleteAll();
        prodRepo.deleteAll();
    }

    @Test
    public void testNewOrderByDay() {
        long prodId = createProduct("example", 10.50f);
        String day = "2025-05-14";

        ProductDayQuantity pdq = new ProductDayQuantity(prodId, day, 10);
        consumer.productAddedToOrder(1L, pdq);
        OrdersByDay result = OBDRepo.findByProductIdAndDay(prodId, day).orElse(null);

        assertEquals(1, OBDClient.getOrdersByDay().size());
        assertEquals(10, result.getCount());
        assertEquals(day, result.getDay());
    }

    @Test
    public void testExistingOrderByDay() {
        long prodId = createProduct("example", 10.50f);
        Product product = prodRepo.findById(prodId).orElse(null);
        String day = "2025-05-14";

        long orderByDayId = createOrdersByDay(day, 5, product);
        ProductDayQuantity pdq = new ProductDayQuantity(prodId, day, 10);

        consumer.productAddedToOrder(1L, pdq);
        OrdersByDay result = OBDRepo.findByProductIdAndDay(prodId, day).orElse(null);

        assertEquals(1, OBDClient.getOrdersByDay().size());
        assertEquals(15, result.getCount());
        assertEquals(day, result.getDay());
        assertEquals(orderByDayId, result.getId());
    }

    private long createProduct(String name, float unitPrice) {
        ProductDTO dto = new ProductDTO();
        dto.setName(name);
        dto.setUnitPrice(unitPrice);
        HttpResponse<Void> res = prodClient.createProduct(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private long createOrdersByDay(String day, int count, Product product) {
        OrdersByDayDTO dto = new OrdersByDayDTO();
        dto.setDay(day);
        dto.setCount(count);
        dto.setProduct(product);
        HttpResponse<Void> res = OBDClient.createOrdersByDay(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
