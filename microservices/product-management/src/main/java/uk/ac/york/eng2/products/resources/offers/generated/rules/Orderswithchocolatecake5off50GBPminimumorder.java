
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;
import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check50minprice;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.CheckQuantityChocolateCake1;

import uk.ac.york.eng2.products.resources.offers.generated.offers.Reduction5GBP;

/**
* Auto-generated offer handler for rule: Orders with chocolate cake £5 off (50 GBP minimum order)
*/
public class Orderswithchocolatecake5off50GBPminimumorder {

	public OfferPricingContext pricingContext;

	public Orderswithchocolatecake5off50GBPminimumorder(OfferPricingContext pricingContext) {
		this.pricingContext = pricingContext;
	}

	public boolean isOfferValid() {
		boolean allValid = true;

		// protected region check_Check50minprice on begin //
		Boolean Check50minpriceIsValid = new Check50minprice().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Check50minprice end //

		// protected region check_CheckQuantityChocolateCake1 on begin //
		Boolean CheckQuantityChocolateCake1IsValid = new CheckQuantityChocolateCake1().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_CheckQuantityChocolateCake1 end //

		if (!Check50minpriceIsValid) {
			return false;
		}

		return true;
		if (!CheckQuantityChocolateCake1IsValid) {
			return false;
		}

		return true;
	}

	public float applyOffer() {
		float totalReduction = 0;
		// protected region Reduction5GBP on begin //
		totalReduction += Reduction5GBP.[appropriate_method_for_offer];
		// TODO: use correct method per offer and apply specific logic
		// protected region Reduction5GBP end //
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

		return totalReduction;
	}

	public String getRuleName() {
		return "Orders with chocolate cake £5 off (50 GBP minimum order)";
	}
}