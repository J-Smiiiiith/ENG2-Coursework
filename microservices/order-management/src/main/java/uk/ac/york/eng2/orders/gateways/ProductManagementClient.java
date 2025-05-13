package uk.ac.york.eng2.orders.gateways;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Singleton
public class ProductManagementClient implements ProductManagementGateway {
    @Inject
    ProductManagementClient client;

    public Map<String, Map<Long, Integer>> checkProductsValidity(Map<Long, Integer> products) {
        return new HashMap<>();
    }

    public float getProductsPrice(Map<Long, Integer> products) {
        return 0;
    }
}
