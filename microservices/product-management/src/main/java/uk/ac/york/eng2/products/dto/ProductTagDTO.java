package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class ProductTagDTO {
    private Long productId;
    private Long tagId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }
}
