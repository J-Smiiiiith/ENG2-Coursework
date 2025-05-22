package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.dto.TagDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class ProductTagTest {
    @Inject
    ProductTagClient prodTagClient;

    @Inject
    ProductClient prodClient;

    @Inject
    TagClient tagClient;

    @Inject
    ProductTagRepository prodTagRepo;

    @Inject
    ProductRepository prodRepo;

    @Inject
    TagRepository tagRepo;

    @BeforeEach
    void setup() {
        prodTagRepo.deleteAll();
        prodRepo.deleteAll();
        tagRepo.deleteAll();
    }

    @Test
    public void noProductTagsTest() {
        assert prodTagRepo.findAll().isEmpty();
    }

    @Test
    public void addTagToProductTest() {
        long prodId = createProduct("Test Product", 10.0f);
        long tagId = createTag("Test Tag");
        prodTagClient.addTagToProduct(prodId, tagId);

        List<ProductTag> productTags = prodTagRepo.findAll();
        assertEquals(1, productTags.size());
        assertEquals(prodId, productTags.get(0).getProduct().getId());
        assertEquals(tagId, productTags.get(0).getTag().getId());
    }

    @Test
    public void getProductTagsTest() {
        long prodId = createProduct("Test Product", 10.0f);
        long tagId = createTag("Test Tag");
        prodTagClient.addTagToProduct(prodId, tagId);

        prodId = createProduct("Test Product 2", 20.0f);
        tagId = createTag("Test Tag 2");
        prodTagClient.addTagToProduct(prodId, tagId);

        assertEquals(2, prodTagClient.getProductTags().size());
    }

    @Test
    public void getProductsByTagId() {
        long prodId = createProduct("Test Product", 10.0f);
        long tagId = createTag("Test Tag");
        prodTagClient.addTagToProduct(prodId, tagId);
        List<Product> products = prodTagClient.getProductsByTagId(tagId);
        assertEquals(1, products.size());
        assertEquals("Test Product", products.get(0).getName());
    }

    @Test
    public void getTagsByProductId() {
        long prodId = createProduct("Test Product", 10.0f);
        long tagId = createTag("Test Tag");
        prodTagClient.addTagToProduct(prodId, tagId);
        List<Tag> tags = prodTagClient.getTagsByProductId(prodId);
        assertEquals(1, tags.size());
        assertEquals("Test Tag", tags.get(0).getName());
    }

    private long createProduct(String name, float unitPrice) {
        ProductDTO dto = new ProductDTO();
        dto.setName(name);
        dto.setUnitPrice(unitPrice);
        HttpResponse<Void> res = prodClient.createProduct(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }

    private long createTag(String name) {
        TagDTO dto = new TagDTO();
        dto.setName(name);
        HttpResponse<Void> res = tagClient.createTag(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
