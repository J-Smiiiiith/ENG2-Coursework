package uk.ac.york.eng2.products.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

@Entity
@Serdeable
@IdClass(ProductTagId.class)
public class ProductTag {
    @Id
    @ManyToOne
    @JoinColumn(name = "products_id")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "tags_id")
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
