package uk.ac.york.eng2.products.resources.offers.src;

import java.util.List;
import java.util.Map;

/**
 * Abstract class for offer handler operations.
 * This class provides common methods for applying different types of offers.
 */
public abstract class AbstractOfferHandlerOperations {

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
     * @param totalPrice the total price of the order
     * @return the new total price reduction after applying the percentage reduction
     */
    protected float applyPricePercentageReduction(float percentageReduction, float totalPrice) {
        return totalPrice * (percentageReduction / 100);
    }
    /**
     * Applies a free product offer to the order.
     *
     * @param freeProductPrice the price of the free product
     * @return the new total price reduction after applying the free product offer
     */
    protected float applyFreeProduct(float freeProductPrice) {
        return freeProductPrice;
    }

    /**
     * Applies a fixed price offer to the order.
     *
     * @param newPrice the new fixed price to apply
     * @param fixedPriceProducts the price of the products, and quantity of those products, that the fixed price applies
     * to
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
