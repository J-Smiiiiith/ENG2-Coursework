package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class OrdersDTO {
    private String address;
    private boolean paid;
    private boolean delivered;
    private long customerId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}
