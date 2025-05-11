package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductTagDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            List<ProductTag> productTags = prodTagRepo.findAll();
            List<Tag> tags = new ArrayList<>();
            for (ProductTag productTag : productTags) {
                if (productTag.getProduct().equals(product)) {
                    tags.add(productTag.getTag());
                }
            }
            return tags;
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
            return prodTagRepo.findProductByTag(tag);
        }
    }


    @Put("/product/{product_id}/tag/{tag_id}")
    @Transactional
    public void addTagToProduct(@PathVariable long product_id, @PathVariable long tag_id) {
        Product product = prodRepo.findById(product_id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        Tag tag = tagRepo.findById(tag_id).orElse(null);
        if (tag == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }

        Optional<ProductTag> productTag = prodTagRepo.findByProductAndTag(product, tag);
        if (productTag.isPresent()) {
            throw new HttpStatusException(HttpStatus.CONFLICT, "Product already has this tag");
        }
        else {
            ProductTagDTO dto = new ProductTagDTO();
            dto.setTag(tag);
            dto.setProduct(product);

            ProductTag newProductTag = new ProductTag();
            newProductTag.setProduct(dto.getProduct());
            newProductTag.setTag(dto.getTag());
            prodTagRepo.save(newProductTag);
        }
    }
}
