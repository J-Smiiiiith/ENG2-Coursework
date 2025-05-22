package uk.ac.york.eng2.products.resources.offers.src;

import java.util.Map;

/**
 * Interface for offer handler operations.
 */
public interface OfferHandler {
    /**
     * Get the name of the rule.
     *
     * @return the name of the rule
     */
    String getRuleName();

    /**
     * Check whether the offer is valid for the given products.
     *
     * @return true/false for validity of offer
     */
    boolean isOfferValid(Map<Long, Integer> order);

    /**
     * Apply the offer to the given products.
     * @return the new total price after applying the offer
     */
    float applyOffer();
}
