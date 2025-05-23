
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check2LargePizzas;

import uk.ac.york.eng2.products.resources.offers.generated.offers.Fixed10;
import uk.ac.york.eng2.products.resources.offers.generated.offers.FreeIceCream;

/**
* Auto-generated offer  handler for rule: Large Pizzas 2 for £10, with one free large ice cream
*/
public class LargePizzas2for10withonefreelargeicecream {

	public OfferPricingContext pricingContext;

	public LargePizzas2for10withonefreelargeicecream(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public boolean isOfferValid() {
		boolean allValid = true;

		// protected region check_Check2LargePizzas on begin //
		Boolean Check2LargePizzasIsValid = new Check2LargePizzas().checkCondition(pricingContext.getOrderWithNameAndQuantity()); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Check2LargePizzas end //

		if (!Check2LargePizzasIsValid) {
			return false;
		}
		return true;
	}

	public float applyOffer() {
		// protected region Fixed10 on begin //
		float totalReduction = new Fixed10().getFixedPrice();
		// protected region Fixed10 end //

		// protected region FreeIceCream on begin //

		return totalReduction + new FreeIceCream().getFreeProductPrice();
		// protected region FreeIceCream end //
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

		if (!offerValid) return totalReduction + new Pizzas2for1(pricingContext).useOfferRule();
		if (offerValid) return totalReduction + new ChristmasDayDiscount1060GBPminimumorder(pricingContext).useOfferRule();
		else { return totalReduction; }
	}

	public String getRuleName() {
		return "Large Pizzas 2 for £10, with one free large ice cream";
	}
}