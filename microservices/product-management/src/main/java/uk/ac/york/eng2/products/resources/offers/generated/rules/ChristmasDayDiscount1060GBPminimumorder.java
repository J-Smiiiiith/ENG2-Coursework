
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.CheckChristmasDay;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check60minprice;

import uk.ac.york.eng2.products.resources.offers.generated.offers.ChristmasReduction10;

/**
* Auto-generated offer handler for rule: Christmas Day Discount 10% (60 GBP minimum order)
*/
public class ChristmasDayDiscount1060GBPminimumorder {

	public OfferPricingContext pricingContext;

	public ChristmasDayDiscount1060GBPminimumorder(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public boolean isOfferValid() {
		boolean allValid = true;

		// protected region check_CheckChristmasDay on begin //
		Boolean CheckChristmasDayIsValid = new CheckChristmasDay().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_CheckChristmasDay end //

		// protected region check_Check60minprice on begin //
		Boolean Check60minpriceIsValid = new Check60minprice().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Check60minprice end //

		if (!CheckChristmasDayIsValid) {
			return false;
		}

		return true;
		if (!Check60minpriceIsValid) {
			return false;
		}

		return true;
	}

	public float applyOffer() {
		float totalReduction = 0;
		// protected region ChristmasReduction10 on begin //
		totalReduction += ChristmasReduction10.[appropriate_method_for_offer];
		// TODO: use correct method per offer and apply specific logic
		// protected region ChristmasReduction10 end //
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

		if (!offerValid) return totalReduction + new Orderswithchocolatecake5off50GBPminimumorder(pricingContext).useOfferRule();
		return totalReduction;
	}

	public String getRuleName() {
		return "Christmas Day Discount 10% (60 GBP minimum order)";
	}
}