package uk.ac.york.eng2.orders.gateways;

import java.util.Map;

public interface ProductManagementGateway {
    Map<String, Map<Long, Integer>> checkProductsValidity(Map<Long, Integer> products);
    float getProductsPrice(Map<Long, Integer> products);
}