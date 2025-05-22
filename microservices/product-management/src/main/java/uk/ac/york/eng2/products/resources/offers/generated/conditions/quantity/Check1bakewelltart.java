package uk.ac.york.eng2.products.resources.offers.generated.conditions.quantity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
* Auto-generated condition handler for condition: Check 1 bakewell tart
*/
public class Check1bakewelltart {

	private List<String> applicableProducts;
	private int minQuantity;

	public Check1bakewelltart() {
		this.applicableProducts = Arrays.asList("Bakewell Tarts");
		this.minQuantity = 1;
	}

	public boolean checkCondition(Map<String, Integer> order) {
		int count = 0;

		for (String product : applicableProducts) {
			if (order.containsKey(product)) {
				count += order.get(product);
			}
		}

		return count >= minQuantity;
	}

	public String getConditionName() {
		return "Check 1 bakewell tart";
	}
}