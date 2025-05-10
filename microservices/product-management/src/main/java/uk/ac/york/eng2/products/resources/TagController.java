package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagDTO;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.net.URI;
import java.util.List;

@Controller(TagController.PREFIX)
public class TagController {
    public static final String PREFIX = "/tags";

    @Inject
    TagRepository repo;

    @Get
    public List<Tag> getTags() {
        return repo.findAll();
    }

    @Get("/{id}")
    public Tag getTag(@PathVariable long id) {
        return repo.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createTag(@Body TagDTO dto) {
        Tag tag = new Tag();
        tag.setName(dto.getName());
        repo.save(tag);
        return HttpResponse.created(URI.create(PREFIX + "/" + tag.getId()));
    }

    @Put("/{id}")
    @Transactional
    public void updateTag(@PathVariable long id, @Body TagDTO dto) {
        Tag tag = repo.findById(id).orElse(null);
        if (tag == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        } else {
            tag.setName(dto.getName());
            repo.save(tag);
        }
    }

    @Delete("/{id}")
    @Transactional
    public void deleteTag(@PathVariable long id) {
        Tag tag = repo.findById(id).orElse(null);
        if (tag == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        } else {
            repo.delete(tag);
        }
    }
}
