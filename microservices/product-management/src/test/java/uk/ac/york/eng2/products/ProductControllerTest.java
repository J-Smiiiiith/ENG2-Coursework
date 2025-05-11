package uk.ac.york.eng2.products;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(transactional = false)
public class ProductControllerTest {
    @Inject
    ProductClient client;

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
        assertEquals(0, client.getProducts().size());
    }

    @Test
    public void createProductTest() {
        long id = createProduct("Test", 10.50f);
        assertEquals(1, client.getProducts().size());
    }

    @Test
    public void getProductsTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id1 = createProduct(name, unitPrice);
        long id2 = createProduct(name, unitPrice);
        assertEquals(2, client.getProducts().size());
    }

    @Test
    public void getProductTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        Product craetedProduct = client.getProduct(id);

        assertNotNull(craetedProduct);
        assertEquals(name, craetedProduct.getName());
        assertEquals(unitPrice, craetedProduct.getUnitPrice());
        assertEquals(id, craetedProduct.getId());
    }

    @Test
    public void updateProductNameTest() {
        String name = "Test";
        String updatedName = "Updated";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        Product createdProduct = client.getProduct(id);
        assertEquals(name, createdProduct.getName());

        ProductDTO dto = new ProductDTO();
        dto.setName(updatedName);
        client.updateProduct(id, dto);
        Product updatedProduct = client.getProduct(id);
        assertEquals(updatedName, updatedProduct.getName());
        assertEquals(id, updatedProduct.getId());
    }

    @Test
    public void updateProductPriceTest() {
        String name = "Test";
        float unitPrice = 10.50f;
        float updatedPrice = 20.50f;

        long id = createProduct(name, unitPrice);
        Product createdProduct = client.getProduct(id);
        assertEquals(unitPrice, createdProduct.getUnitPrice());

        ProductDTO dto = new ProductDTO();
        dto.setUnitPrice(updatedPrice);
        client.updateProduct(id, dto);

        Product updatedProduct = client.getProduct(id);
        assertEquals(updatedPrice, updatedProduct.getUnitPrice());
        assertEquals(id, updatedProduct.getId());
    }

    @Test
    public void deleteProductTest() {
        String name = "Test";
        float unitPrice = 10.50f;

        long id = createProduct(name, unitPrice);
        assertEquals(1, client.getProducts().size());

        client.deleteProduct(id);
        assertEquals(0, client.getProducts().size());
    }

    private long createProduct(String name, float unitPrice) {
        ProductDTO dto = new ProductDTO();
        dto.setName(name);
        dto.setUnitPrice(unitPrice);
        HttpResponse<Void> res = client.createProduct(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
