
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2Pizzas;

import uk.ac.york.eng2.products.resources.offers.generated.offers.BOGOF;

/**
* Auto-generated offer handler for rule: Pizzas 2 for 1
*/
public class Pizzas2for1 {

	public OfferPricingContext pricingContext;

	public Pizzas2for1(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public boolean isOfferValid() {
		boolean allValid = true;

		// protected region check_Check2Pizzas on begin //
		Boolean Check2PizzasIsValid = new Check2Pizzas().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Check2Pizzas end //

		if (!Check2PizzasIsValid) {
			return false;
		}

		return true;
	}

	public float applyOffer() {
		float totalReduction = 0;
		// protected region BOGOF on begin //
		totalReduction += BOGOF.[appropriate_method_for_offer];
		// TODO: use correct method per offer and apply specific logic
		// protected region BOGOF end //
		return totalReduction;
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
		return totalReduction;
	}

	public String getRuleName() {
		return "Pizzas 2 for 1";
	}
}