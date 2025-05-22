package uk.ac.york.eng2.products.resources.offers.src;

import java.util.Map;

/**
 * Abstract class for offer handler operations.
 * This class provides common methods for applying different types of offers.
 */
public class AbstractOfferHandlerOperations {

    /**
     * Applies a price reduction to the order.
     *
     * @param reduction the price reduction amount
     * @return the new total price reduction after applying the reduction
     */
    protected float applyPriceReduction(float reduction) {
        return reduction;
    }

    /**
     * Applies a percentage reduction to the order.
     *
     * @param percentageReduction the percentage reduction to apply
     * @return the new total price reduction after applying the percentage reduction
     */
    protected float applyPricePercentageReduction(float percentageReduction) {
        return percentageReduction / 100;
    }
    /**
     * Applies a free product offer to the order.
     *
     * @param freeProducts the product prices, and quantity of those products, to be made free
     * @return the new total price reduction after applying the free product offer
     */
    protected float applyFreeProduct(Map<Float, Integer> freeProducts) {
        float reduction = 0;
        for (float prodPrice : freeProducts.keySet()) {
            int quantity = freeProducts.get(prodPrice);
            reduction += prodPrice * quantity;
        }
        return reduction;
    }

    /**
     * Applies a fixed price offer to the order.
     *
     * @param newPrice the new fixed price to apply
     * @param fixedPriceProducts the IDs of the products, and quantity of those products, that the fixed price applies to
     * @return the new total price reduction after applying the fixed price offer
     */
    protected float applyFixedPrice(float newPrice, Map<Float, Integer> fixedPriceProducts) {
        // implement by calculating price of order with fixed price of products set.
        float total = 0;
        for (float prodPrice : fixedPriceProducts.keySet()) {
            int quantity = fixedPriceProducts.get(prodPrice);
            total += prodPrice * quantity;
        }
        return total - newPrice;
    }


}
