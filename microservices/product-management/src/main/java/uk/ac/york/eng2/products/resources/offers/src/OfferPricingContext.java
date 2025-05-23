package uk.ac.york.eng2.products.resources.offers.src;

import java.time.LocalDate;
import java.util.Map;

public class OfferPricingContext {
    Map<Long, Integer> order;
    Map<String, Integer> orderWithNameAndQuantity;
    Map<String, Map<Float, Integer>> orderWithNamePriceAndQuantity;
    float totalPrice;
    int numOrdersToday;
    String dateToday = LocalDate.now().toString();

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

    public Map<String, Map<Float, Integer>> getOrderWithNamePriceAndQuantity() {
        return orderWithNamePriceAndQuantity;
    }

    public void setOrderWithNamePriceAndQuantity(Map<String, Map<Float, Integer>> orderWithNamePriceAndQuantity) {
        this.orderWithNamePriceAndQuantity = orderWithNamePriceAndQuantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumOrdersToday() {
        return numOrdersToday;
    }

    public void setNumOrdersToday(int numOrdersToday) {
        this.numOrdersToday = numOrdersToday;
    }

    public String getDateToday() {
        return dateToday;
    }

    public void setDateToday(String dateToday) {
        this.dateToday = dateToday;
    }
}
