package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.domain.Tag;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductTagRepository extends PageableRepository<ProductTag, Long> {
    List<Product> findProductByTag(Tag tag);
    Optional<ProductTag> findByProductAndTag(Product product, Tag tag);
}
