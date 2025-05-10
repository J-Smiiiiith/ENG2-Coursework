package uk.ac.york.eng2.products;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.resources.ProductController;

import java.util.List;

@Client(ProductController.PREFIX)
public interface ProductClient {

    @Get
    List<Product> getProducts();

    @Get("/{id}")
    Product getProduct(@PathVariable long id);

    @Post
    HttpResponse<Void> createProduct(@Body ProductDTO dto);

    @Put("/{id}")
    void updateProduct(@PathVariable long id, ProductDTO dto);

    @Delete("/{id}")
    void deleteProduct(@PathVariable long id);
}
