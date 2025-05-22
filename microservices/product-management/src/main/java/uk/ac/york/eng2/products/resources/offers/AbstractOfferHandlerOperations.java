package uk.ac.york.eng2.products.resources.offers;

import java.util.Map;

/**
 * Abstract class for offer handler operations.
 * This class provides common methods for applying different types of offers.
 */
public class AbstractOfferHandlerOperations {

    /**
     * Applies a price reduction to the order.
     *
     * @param order the order containing product IDs and quantities
     * @param reduction the price reduction amount
     * @return the new total price after applying the reduction
     */
    protected float applyPriceReduction(Map<Long, Integer> order, float reduction) {
        // implement
        return 0;
    }

    /**
     * Applies a percentage reduction to the order.
     *
     * @param order the order containing product IDs and quantities
     * @param percentageReduction the percentage reduction to apply
     * @return the new total price after applying the percentage reduction
     */
    protected float applyPricePercentageReduction(Map<Long, Integer> order, float percentageReduction) {
        // implement
        return 0;
    }
    /**
     * Applies a free product offer to the order.
     *
     * @param freeProducts the IDs of the products, and quantity of those products, to be made free
     * @param order the order containing product IDs and quantities
     * @return the new total price after applying the free product offer
     */
    protected float applyFreeProduct(Map<Long, Integer> freeProducts, Map<Long, Integer> order) {
        // implement by removing the product from the list and calculating price without it
        return 0;
    }

    /**
     * Applies a fixed price offer to the order.
     *
     * @param newPrice the new fixed price to apply
     * @param order the order containing product IDs and quantities
     * @param freeProducts the IDs of the products, and quantity of those products, that the fixed price applies to
     * @return the new total price after applying the fixed price offer
     */
    protected float applyFixedPrice(float newPrice, Map<Long, Integer> order, Map<Long, Integer> freeProducts) {
        // implement by calculating price of order with fixed price of products set.
        return 0;
    }


}
