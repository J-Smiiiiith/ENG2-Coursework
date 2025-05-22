
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2LargePizzas;

import uk.ac.york.eng2.products.resources.offers.generated.offers.Fixed10;
import uk.ac.york.eng2.products.resources.offers.generated.offers.FreeIceCream;

/**
* Auto-generated offer handler for rule: Largee Pizzas 2 for £10, with one free large ice cream
*/
public class LargeePizzas2for10withonefreelargeicecream implements OfferHandler {

	@Override
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

	@Override
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

	@Override
	public String getRuleName() {
		return "Largee Pizzas 2 for £10, with one free large ice cream"
	}
}