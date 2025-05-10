package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.ArrayList;
import java.util.List;

@Controller(ProductTagController.PREFIX)
public class ProductTagController {
    public static final String PREFIX = "/product-tags";

    @Inject
    ProductTagRepository prodTagRepo;

    @Inject
    ProductRepository prodRepo;

    @Inject
    TagRepository tagRepo;

    @Get
    public List<ProductTag> getProductTags() {
        return prodTagRepo.findAll();
    }

    @Get("/product_id/{productId}")
    @Transactional
    public List<Tag> getTagsByProductId(@PathVariable long productId) {
        Product product = prodRepo.findById(productId).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        else {
            return new ArrayList<>(prodTagRepo.findTagsByProduct(product));
        }
    }

    @Get("/tag_id/{tagId}")
    @Transactional
    public List<Product> getProductsByTagId(@PathVariable long tagId) {
        Tag tag = tagRepo.findById(tagId).orElse(null);
        if (tag == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }
        else {
            List<ProductTag> productTags = this.getProductTags();
            List<Product> products = new ArrayList<>();
            for (ProductTag productTag : productTags) {
                if (productTag.getTags().contains(tag)) {
                    products.add(productTag.getProduct());
                }
            }
            return products;
        }
    }
}
