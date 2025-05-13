package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Map;

@Serdeable
public class OrdersCreateDTO {
    private String address;
    private Map<Long, Integer> products;
    private long customerId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<Long, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Long, Integer> products) {
        this.products = products;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}
