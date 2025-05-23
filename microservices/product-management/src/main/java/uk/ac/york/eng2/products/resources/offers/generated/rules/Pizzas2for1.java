
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2Pizzas;

import uk.ac.york.eng2.products.resources.offers.generated.offers.BOGOF;

/**
* Auto-generated offer  handler for rule: Pizzas 2 for 1
*/
public class Pizzas2for1 {

	public OfferPricingContext pricingContext;

	public Pizzas2for1(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public boolean isOfferValid() {
		boolean allValid = true;

		// protected region check_Check2Pizzas on begin //
		Boolean Check2PizzasIsValid = new Check2Pizzas().checkCondition(pricingContext.getOrderWithNameAndQuantity());
		// protected region check_Check2Pizzas end //

		if (!Check2PizzasIsValid) {
			return false;
		}
		return true;
	}

	public float applyOffer() {
		// protected region BOGOF on begin //
		return new BOGOF().apply();
		// protected region BOGOF end //
	}

	/**
	* Main logic to calculate the new price of the offer
	*/
	public float useOfferRule() {
		boolean offerValid = this.isOfferValid();
		float totalReduction = 0;

		if (offerValid) {
			totalReduction = this.applyOffer();
		}

		return totalReduction + new ChristmasDayDiscount1060GBPminimumorder(pricingContext).useOfferRule();
	}

	public String getRuleName() {
		return "Pizzas 2 for 1";
	}
}