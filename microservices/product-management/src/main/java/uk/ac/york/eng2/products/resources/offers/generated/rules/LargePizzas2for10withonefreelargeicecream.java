
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2LargePizzas;

import uk.ac.york.eng2.products.resources.offers.generated.offers.Fixed10;
import uk.ac.york.eng2.products.resources.offers.generated.offers.FreeIceCream;

/**
* Auto-generated offer handler for rule: Large Pizzas 2 for £10, with one free large ice cream
*/
public class LargePizzas2for10withonefreelargeicecream {

	public boolean isOfferValid(Map<Long, Integer> order) {
		boolean allValid = true;

		// protected region check_Check2LargePizzas on begin //
		Boolean Check2LargePizzasIsValid = new Check2LargePizzas().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Check2LargePizzas end //

		if (!Check2LargePizzasIsValid) {
			return false;
		}

		return true;
	}

	public float applyOffer() {
		float totalReduction = 0;
		// protected region Fixed10 on begin //
		totalReduction += Fixed10.[appropriate_method_for_offer];
		// TODO: use correct method per offer and apply specific logic
		// protected region Fixed10 end //
		// protected region FreeIceCream on begin //
		totalReduction += FreeIceCream.[appropriate_method_for_offer];
		// TODO: use correct method per offer and apply specific logic
		// protected region FreeIceCream end //
		return totalReduction;
	}

	/**
	* Main logic to calculate the new price of the offer
	*/
	public float useOfferRule(Map<Long, Integer> order) {
		boolean offerValid = this.isOfferValid(order);
		float totalReduction = 0;

		if (offerValid) {
			totalReduction = this.applyOffer();
		}

		if (!offerValid) return totalReduction + new Pizzas2for1().useOfferRule(order);
		if (offerValid) return totalReduction + new ChristmasDayDiscount1060GBPminimumorder.useOfferRule(order);
		return totalReduction;
	}

	public String getRuleName() {
		return "Large Pizzas 2 for £10, with one free large ice cream";
	}
}