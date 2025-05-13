package uk.ac.york.eng2.orders.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.orders.domain.Orders;

@Serdeable
public class OrderItemDTO {
    private long productId;
    private Orders orderId;
    private int quantity;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }
}
