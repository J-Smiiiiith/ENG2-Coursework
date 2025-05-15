package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductDTO;

import java.util.List;
import java.util.Map;

@Client(ProductController.PREFIX)
public interface ProductClient {

    @Get
    List<Product> getProducts();

    @Get("/{id}")
    Product getProduct(@PathVariable long id);

    @Get("/{productId}/unit_price")
    float getProductUnitPrice(@PathVariable long productId);

    @Post
    HttpResponse<Void> createProduct(@Body ProductDTO dto);

    @Post("/products/validate")
    Map<String, Map<Long, Integer>> checkProductsValidity(@Body Map<Long, Integer> products);

    @Post("/products/total_price")
    float getProductsPrice(@Body Map<Long, Integer> products);

    @Put("/{id}")
    void updateProduct(@PathVariable long id, @Body ProductDTO dto);

    @Delete("/{id}")
    void deleteProduct(@PathVariable long id);
}
