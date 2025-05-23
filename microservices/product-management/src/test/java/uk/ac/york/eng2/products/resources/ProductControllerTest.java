package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayDTO;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(transactional = false)
public class ProductControllerTest {
    @Inject
    ProductClient prodClient;

    @Inject
    OrdersByDayClient ordersByDayClient;

    @Inject
    ProductRepository prodRepo;

    @Inject
    ProductTagRepository prodTagRepo;

    @BeforeEach
    void setup() {
        prodTagRepo.deleteAll();
        prodRepo.deleteAll();
    }

    @Test
    public void noProductsTest() {
        assertEquals(0, prodClient.getProducts().size());
    }

    @Test
    public void createProductTest() {
        long id = createProduct("Test", 10.50f);
        assertEquals(1, prodClient.getProducts().size());
    }

    @Test
    public void getProductsTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id1 = createProduct(name, unitPrice);
        long id2 = createProduct(name, unitPrice);
        assertEquals(2, prodClient.getProducts().size());
    }

    @Test
    public void getProductTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        Product craetedProduct = prodClient.getProduct(id);

        assertNotNull(craetedProduct);
        assertEquals(name, craetedProduct.getName());
        assertEquals(unitPrice, craetedProduct.getUnitPrice());
        assertEquals(id, craetedProduct.getId());
    }

    @Test
    public void getProductUnitPriceTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        float price = prodClient.getProductUnitPrice(id);

        assertEquals(unitPrice, price);
    }

    @Test
    public void updateProductNameTest() {
        String name = "Test";
        String updatedName = "Updated";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        Product createdProduct = prodClient.getProduct(id);
        assertEquals(name, createdProduct.getName());

        ProductDTO dto = new ProductDTO();
        dto.setName(updatedName);
        prodClient.updateProduct(id, dto);
        Product updatedProduct = prodClient.getProduct(id);
        assertEquals(updatedName, updatedProduct.getName());
        assertEquals(id, updatedProduct.getId());
    }

    @Test
    public void updateProductPriceTest() {
        String name = "Test";
        float unitPrice = 10.50f;
        float updatedPrice = 20.50f;

        long id = createProduct(name, unitPrice);
        Product createdProduct = prodClient.getProduct(id);
        assertEquals(unitPrice, createdProduct.getUnitPrice());

        ProductDTO dto = new ProductDTO();
        dto.setUnitPrice(updatedPrice);
        prodClient.updateProduct(id, dto);

        Product updatedProduct = prodClient.getProduct(id);
        assertEquals(updatedPrice, updatedProduct.getUnitPrice());
        assertEquals(id, updatedProduct.getId());
    }

    @Test
    public void deleteProductTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        assertEquals(1, prodClient.getProducts().size());

        prodClient.deleteProduct(id);
        assertEquals(0, prodClient.getProducts().size());
    }

    @Test
    public void checkProductsValidityTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id1 = createProduct(name, unitPrice);
        long id2 = createProduct(name, unitPrice);

        Map<Long, Integer> products = new HashMap<>();
        products.put(id1, 2); // Valid product ID
        products.put(id2, 3); // Valid product ID
        products.put(999L, 1); // Invalid product ID
        products.put(1000L, 1); // Invalid product ID
        Map<String, Map<Long, Integer>> response = prodClient.checkProductsValidity(products);
        System.out.println("Response: " + response);
        assertNotNull(response, "Expected a non-null response from /validate");

        Map<Long, Integer> validProducts = response.get("Valid Products");
        Map<Long, Integer> invalidProducts = response.get("Invalid Products");
        assertEquals(2, validProducts.size());
        assertTrue(validProducts.containsKey(id1));
        assertTrue(validProducts.containsKey(id2));
        assertEquals(2, invalidProducts.size());
        assertTrue(invalidProducts.containsKey(999L));
        assertTrue(invalidProducts.containsKey(1000L));
    }

    @Test
    public void getProductsPriceTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id1 = createProduct(name, unitPrice);
        long id2 = createProduct(name, unitPrice);

        Map<Long, Integer> products = new HashMap<>();
        products.put(id1, 2);
        products.put(id2, 3);

        float totalPrice = prodClient.getProductsPrice(products);
        assertEquals(2 * unitPrice + 3 * unitPrice, totalPrice);
    }

    @Test
    public void getProductPriceTestWith2For1PizzaOffer() {
        String name1 = "Large Pizza";
        float unitPrice1 = 4.25f;
        String name2 = "Chips";
        float unitPrice2 = 1.50f;

        long id1 = createProduct(name1, unitPrice1);
        long id2 = createProduct(name2, unitPrice2);

        Map<Long, Integer> products = new HashMap<>();
        products.put(id1, 2);
        products.put(id2, 1);

        float totalPrice = prodClient.getProductsPrice(products);
        // Should hit the 2 for 1 on Pizzas offer
        assertEquals(1 * unitPrice1 + 1 * unitPrice2, totalPrice);
    }

    @Test
    public void getProductPriceTestWith£5OffOfferAndA2For1PizzaOffer() {
        String name1 = "Large Pizza";
        float unitPrice1 = 4.25f;
        String name2 = "Chocolate Cake";
        float unitPrice2 = 3.47f;
        String name3 = "lamborghini";
        float unitPrice3 = 263000f;

        long id1 = createProduct(name1, unitPrice1);
        long id2 = createProduct(name2, unitPrice2);
        long id3 = createProduct(name3, unitPrice3);

        Map<Long, Integer> products = new HashMap<>();
        products.put(id1, 2);
        products.put(id2, 3);
        products.put(id3, 1);

        float totalPrice = prodClient.getProductsPrice(products);
        // Should hit the 2 for 1 on Pizzas offer and the £5 off offer
        assertEquals(((1 * unitPrice1) + (3 * unitPrice2) + (1 * unitPrice3))-5, totalPrice);
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
        HttpResponse<Void> res = ordersByDayClient.createOrdersByDay(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
