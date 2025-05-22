
package uk.ac.york.eng2.products.resources.offers.generated.rules;

import java.util.Map;

import uk.ac.york.eng2.products.resources.offers.generated.conditions.Checknumorders10;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.Check1bakewelltart;
import uk.ac.york.eng2.products.resources.offers.generated.conditions.CheckDate10052025;

import uk.ac.york.eng2.products.resources.offers.generated.offers.Reduction10;

/**
* Auto-generated offer handler for rule: First 10 orders of Bakewell Tarts in the day 10% off
*/
public class First10ordersofBakewellTartsintheday10off {

	public boolean isOfferValid(Map<Long, Integer> order) {
		boolean allValid = true;

		// protected region check_Checknumorders10 on begin //
		Boolean Checknumorders10IsValid = new Checknumorders10().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Checknumorders10 end //

		// protected region check_Check1bakewelltart on begin //
		Boolean Check1bakewelltartIsValid = new Check1bakewelltart().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_Check1bakewelltart end //

		// protected region check_CheckDate10052025 on begin //
		Boolean CheckDate10052025IsValid = new CheckDate10052025().checkCondition(); //some parameter tbd//
		// TODO: use correct parameter per condition
		// protected region check_CheckDate10052025 end //

		if (!Checknumorders10IsValid) {
			return false;
		}

		return true;
		if (!Check1bakewelltartIsValid) {
			return false;
		}

		return true;
		if (!CheckDate10052025IsValid) {
			return false;
		}

		return true;
	}

	public float applyOffer() {
		float totalReduction = 0;
		// protected region Reduction10 on begin //
		totalReduction += Reduction10.[appropriate_method_for_offer];
		// TODO: use correct method per offer and apply specific logic
		// protected region Reduction10 end //
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

		return totalReduction + new LargePizzas2for10withonefreelargeicecream.useOfferRule(order);
		return totalReduction;
	}

	public String getRuleName() {
		return "First 10 orders of Bakewell Tarts in the day 10% off ";
	}
}