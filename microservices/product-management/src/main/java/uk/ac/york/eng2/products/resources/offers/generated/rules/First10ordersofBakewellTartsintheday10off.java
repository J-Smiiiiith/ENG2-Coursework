
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Checknumorders10;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check1bakewelltart;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.CheckDate10052025;

import uk.ac.york.eng2.products.resources.offers.generated.offers.Reduction10;

/**
* Auto-generated offer  handler for rule: First 10 orders of Bakewell Tarts in the day 10% off
*/
public class First10ordersofBakewellTartsintheday10off {

	public OfferPricingContext pricingContext;

	public First10ordersofBakewellTartsintheday10off(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public boolean isOfferValid() {
		// protected region check_Checknumorders10 on begin //
		System.out.println("CXX :" + pricingContext.getNumOrdersToday());
		Boolean Checknumorders10IsValid = new Checknumorders10().checkCondition(pricingContext.getNumOrdersToday());
		// protected region check_Checknumorders10 end //

		// protected region check_Check1bakewelltart on begin //
		Boolean Check1bakewelltartIsValid = new Check1bakewelltart().checkCondition(pricingContext.getOrderWithNameAndQuantity());
		// protected region check_Check1bakewelltart end //

		// protected region check_CheckDate10052025 on begin //
		Boolean CheckDate10052025IsValid = new CheckDate10052025().checkCondition(pricingContext.getDateToday());
		// protected region check_CheckDate10052025 end //

		if (!Checknumorders10IsValid) {
			return false;
		}
		if (!Check1bakewelltartIsValid) {
			return false;
		}
		if (!CheckDate10052025IsValid) {
			return false;
		}
		return true;
	}

	public float applyOffer() {
		// protected region Reduction10 on begin //
		return new Reduction10(pricingContext.getTotalPrice()).apply();
		// protected region Reduction10 end //
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

		return totalReduction + new LargePizzas2for10withonefreelargeicecream(pricingContext).useOfferRule();
	}

	public String getRuleName() {
		return "First 10 orders of Bakewell Tarts in the day 10% off ";
	}
}