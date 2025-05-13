package uk.ac.york.eng2.orders.gateways;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.validation.Validated;

import java.util.Map;

@Validated
@Client("product-management")
public interface ProductManagementClientApi {

    @Post("/products/validate")

    @Post("/products/total_price")
    float getProductsPrice(@Body Map<Long, Integer> products);
}
