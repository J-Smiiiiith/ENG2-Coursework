package uk.ac.york.eng2.products.domain;

import java.io.Serializable;
import java.util.Objects;

public class ProductTagId implements Serializable {
    private Long product;
    private Long tag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTagId that = (ProductTagId) o;
        return Objects.equals(product, that.product) && Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, tag);
    }
}
