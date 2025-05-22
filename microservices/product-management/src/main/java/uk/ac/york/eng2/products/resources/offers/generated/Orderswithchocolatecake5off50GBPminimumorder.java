
package uk.ac.york.eng2.products.resources.offers.generated;

import uk.ac.york.eng2.products.resources.offers.src.OfferHandler;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check50minprice;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.CheckQuantityChocolateCake1;

/**
* Auto-generated offer handler for rule: Orders with chocolate cake £5 off (50 GBP minimum order)
*/
public class Orderswithchocolatecake5off50GBPminimumorder implements OfferHandler {

	@Override
	public boolean isOfferValid(Map<Long, Integer> order) {
		boolean allValid = true;

		// protected region check_Check50minprice on begin //
		Boolean Check50minpriceIsValid = new Check50minprice().checkCondition(); //some parameter tbd//
		// protected region check_Check50minprice end //

		// protected region check_CheckQuantityChocolateCake1 on begin //
		Boolean CheckQuantityChocolateCake1IsValid = new CheckQuantityChocolateCake1().checkCondition(); //some parameter tbd//
		// protected region check_CheckQuantityChocolateCake1 end //

		if (Check50minpriceIsValid == false) {
			return false;
		}

		return true;
		if (CheckQuantityChocolateCake1IsValid == false) {
			return false;
		}

		return true;
	}

	@Override
	public float applyOffer(Map<Long, Integer> order) {
		float total = 0;
		// total += apply5off(order);
		return total;
	}

	@Override
	public String getRuleName() {
		return "Orders with chocolate cake £5 off (50 GBP minimum order)"
	}
}