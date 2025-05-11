package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;

@Serdeable
public class ProductTagDTO {
    private Product product;
    private Tag tag;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
