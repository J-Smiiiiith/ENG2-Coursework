package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.domain.Tag;

import java.util.Set;

@Repository
public interface ProductTagRepository extends PageableRepository<ProductTag, Long> {
    Set<Tag> findTagsByProduct(Product product);
    Set<Product> findProductsByTag(Tag tag);
}
