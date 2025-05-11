package uk.ac.york.eng2.products;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagDTO;
import uk.ac.york.eng2.products.repository.ProductTagRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(transactional = false)
public class TagControllerTest {
    @Inject
    TagClient client;

    @Inject
    TagRepository tagRepo;

    @Inject
    ProductTagRepository prodTagRepo;

    @BeforeEach
    void setup() {
        prodTagRepo.deleteAll();
        tagRepo.deleteAll();
    }

    @Test
    public void noTagsTest() {
        assertEquals(0, client.getTags().size());
    }

    @Test
    public void createTagTest() {
        long id = createTag("Test");
        assertEquals(1, client.getTags().size());
    }

    @Test
    public void getTagsTest() {
        long id1 = createTag("Test 1");
        long id2 = createTag("Test 2");
        assertEquals(2, client.getTags().size());
    }

    @Test
    public void getTagTest() {
        String name = "Test";

        long id = createTag(name);
        Tag createdTag = client.getTag(id);

        assertNotNull(createdTag);
        assertEquals(name, createdTag.getName());
        assertEquals(id, createdTag.getId());
    }

    @Test
    public void updateTagTest() {
        String name = "Test";
        String newName = "Updated";

        long id = createTag(name);
        Tag createdTag = client.getTag(id);
        assertEquals(name, createdTag.getName());

        TagDTO dto = new TagDTO();
        dto.setName(newName);
        client.updateTag(id, dto);

        Tag updatedTag = client.getTag(id);
        assertEquals(newName, updatedTag.getName());
        assertEquals(id, updatedTag.getId());
    }

    @Test
    public void deleteTagTest() {
        String name = "Test";

        long id = createTag(name);
        assertEquals(1, client.getTags().size());

        client.deleteTag(id);
        assertEquals(0, client.getTags().size());
    }

    private long createTag(String name) {
        TagDTO dto = new TagDTO();
        dto.setName(name);
        HttpResponse<Void> res = client.createTag(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
