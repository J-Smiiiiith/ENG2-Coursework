package uk.ac.york.eng2.products;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.resources.ProductTagController;

import java.util.List;

@Client(ProductTagController.PREFIX)
public interface ProductTagClient {

    @Get
    List<ProductTag> getProductTags();

    @Get("/product_id/{productId}")
    List<Tag> getTagsByProductId(@PathVariable long productId);

    @Get("/tag_id/{tagId}")
    List<Product> getProductsByTagId(@PathVariable long tagId);

    @Put("/product/{product_id}/tag/{tag_id}")
    void addTagToProduct(@PathVariable long product_id, @PathVariable long tag_id);
}

