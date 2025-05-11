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
import io.swagger.v3.oas.annotations.tags.Tag;

import java.net.URI;
import java.util.List;

@Tag(name = "Products")
@Controller(ProductController.PREFIX)
public class ProductController {
    public static final String PREFIX = "/products";

    @Inject
    ProductRepository prodRepo;

    @Get
    public List<Product> getProducts() {
        return prodRepo.findAll();
    }

    @Get("/{id}")
    public Product getProduct(@PathVariable long id) {
        return prodRepo.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createProduct(@Body ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());
        prodRepo.save(product);
        return HttpResponse.created(URI.create(PREFIX + "/" + product.getId()));
    }

    @Put("/{id}")
    @Transactional
    public void updateProduct(@PathVariable long id, @Body ProductDTO dto) {
        Product product = prodRepo.findById(id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        else {
            if (dto.getName() != null) {
                product.setName(dto.getName());
            }
            if (dto.getUnitPrice() != null) {
                product.setUnitPrice(dto.getUnitPrice());
            }
            prodRepo.save(product);
        }
    }

    @Delete("/{id}")
    @Transactional
    public void deleteProduct(@PathVariable long id) {
        Product product = prodRepo.findById(id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        } else {
            prodRepo.delete(product);
        }
    }
}
