package uk.ac.york.eng2.products.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.products.domain.Product;

@Serdeable
public class OrdersByDayDTO {
    private String day;
    private Integer count;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
