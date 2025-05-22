package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagDTO;

import java.util.List;

@Client(TagController.PREFIX)
public interface TagClient {

    @Get
    List<Tag> getTags();

    @Get("/{id}")
    Tag getTag(@PathVariable long id);

    @Post
    HttpResponse<Void> createTag(@Body TagDTO dto);

    @Put("/{id}")
    void updateTag(@PathVariable long id, @Body TagDTO dto);

    @Delete("/{id}")
    void deleteTag(@PathVariable long id);
}
