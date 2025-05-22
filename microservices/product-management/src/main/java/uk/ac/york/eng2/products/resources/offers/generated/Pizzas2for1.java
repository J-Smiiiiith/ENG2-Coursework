
package uk.ac.york.eng2.products.resources.offers.generated;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2Pizzas;

/**
* Auto-generated offer handler for rule: Pizzas 2 for 1
*/
public class Pizzas2for1 implements OfferHandler {

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		boolean allValid = true;

		// protected region check_Check2Pizzas on begin //
		Boolean Check2PizzasIsValid = new Check2Pizzas().checkCondition(); //some parameter tbd//
		// protected region check_Check2Pizzas end //

		if (Check2PizzasIsValid == false) {
			return false;
		}

		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		// total += applyBOGOF(order);
		return total;
	}

	@Override
	public String getRuleName() {
		return "Pizzas 2 for 1"
	}
}