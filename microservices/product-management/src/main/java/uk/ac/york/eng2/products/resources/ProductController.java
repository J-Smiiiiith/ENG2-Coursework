package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.net.URI;
import java.util.List;

@Controller(ProductController.PREFIX)
public class ProductController {
    public static final String PREFIX = "/products";
    @Inject
    ProductRepository repo;

    @Get
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @Get("/{id}")
    public Product getProduct(@PathVariable long id) {
        return repo.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createProduct(@Body ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());
        repo.save(product);
        return HttpResponse.created(URI.create("/products/" + product.getId()));
    }

    @Put("/{id}")
    @Transactional
    public void updateProduct(@PathVariable long id, @Body ProductDTO dto) {
        Product product = repo.findById(id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        else {
            product.setName(dto.getName());
            product.setUnitPrice(dto.getUnitPrice());
            repo.save(product);
        }
    }

    @Delete("/{id}")
    @Transactional
    public void deleteProduct(@PathVariable long id) {
        Product product = repo.findById(id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        } else {
            repo.delete(product);
        }
    }
}
