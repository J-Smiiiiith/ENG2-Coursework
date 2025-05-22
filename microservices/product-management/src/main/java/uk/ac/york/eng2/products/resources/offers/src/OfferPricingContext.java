package uk.ac.york.eng2.products.resources.offers.src;

import java.time.LocalDate;
import java.util.Map;

public class OfferPricingContext {
    Map<Long, Integer> order;
    Map<String, Integer> orderWithNameAndQuantity;
    Map<Float, Integer> orderWithPriceAndQuantity;
    float totalPrice;
    int numOrdersOfGivenProduct;
    String dateToday = LocalDate.now().toString();

    public OfferPricingContext(Map<Long, Integer> order, Map<String, Integer> orderWithNameAndQuantity, Map<Float,
            Integer> orderWithPriceAndQuantity, float totalPrice, int numOrdersOfGivenProduct) {
        this.order = order;
        this.orderWithNameAndQuantity = orderWithNameAndQuantity;
        this.orderWithPriceAndQuantity = orderWithPriceAndQuantity;
        this.totalPrice = totalPrice;
        this.numOrdersOfGivenProduct = numOrdersOfGivenProduct;
    }

    public Map<Long, Integer> getOrder() {
        return order;
    }

    public void setOrder(Map<Long, Integer> order) {
        this.order = order;
    }

    public Map<String, Integer> getOrderWithNameAndQuantity() {
        return orderWithNameAndQuantity;
    }

    public void setOrderWithNameAndQuantity(Map<String, Integer> orderWithNameAndQuantity) {
        this.orderWithNameAndQuantity = orderWithNameAndQuantity;
    }

    public Map<Float, Integer> getOrderWithPriceAndQuantity() {
        return orderWithPriceAndQuantity;
    }

    public void setOrderWithPriceAndQuantity(Map<Float, Integer> orderWithPriceAndQuantity) {
        this.orderWithPriceAndQuantity = orderWithPriceAndQuantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumOrdersOfGivenProduct() {
        return numOrdersOfGivenProduct;
    }

    public void setNumOrdersOfGivenProduct(int numOrdersOfGivenProduct) {
        this.numOrdersOfGivenProduct = numOrdersOfGivenProduct;
    }

    public String getDateToday() {
        return dateToday;
    }

    public void setDateToday(String dateToday) {
        this.dateToday = dateToday;
    }
}
