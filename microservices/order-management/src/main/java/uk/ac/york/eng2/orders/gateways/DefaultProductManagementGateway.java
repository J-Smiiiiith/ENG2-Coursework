package uk.ac.york.eng2.orders.gateways;

import io.micronaut.core.annotation.Creator;
import jakarta.inject.Singleton;

import java.util.Map;

@Singleton
public class DefaultProductManagementGateway implements ProductManagementGateway {
    private final ProductManagementClientApi clientApi;

    @Creator
    public DefaultProductManagementGateway(ProductManagementClientApi clientApi) {
        this.clientApi = clientApi;
    }

    @Override
    public Map<String, Map<Long, Integer>> checkProductsValidity(Map<Long, Integer> products) {
        return clientApi.checkProductsValidity(products);
    }

    @Override
    public float getProductsPrice(Map<Long, Integer> products) {
        return clientApi.getProductsPrice(products);
    }
}
