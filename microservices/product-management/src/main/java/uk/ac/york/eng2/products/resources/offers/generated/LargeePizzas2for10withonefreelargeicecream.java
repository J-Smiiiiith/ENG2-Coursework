
package uk.ac.york.eng2.products.resources.offers.generated;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2LargePizzas;

/**
* Auto-generated offer handler for rule: Largee Pizzas 2 for £10, with one free large ice cream
*/
public class LargeePizzas2for10withonefreelargeicecream implements OfferHandler {

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		boolean allValid = true;

		// protected region check_Check2LargePizzas on begin //
		Boolean Check2LargePizzasIsValid = new Check2LargePizzas().checkCondition(); //some parameter tbd//
		// protected region check_Check2LargePizzas end //

		if (Check2LargePizzasIsValid == false) {
			return false;
		}

		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		// total += applyFixed10(order);
		// total += applyFreeIceCream(order);
		return total;
	}

	@Override
	public String getRuleName() {
		return "Largee Pizzas 2 for £10, with one free large ice cream"
	}
}