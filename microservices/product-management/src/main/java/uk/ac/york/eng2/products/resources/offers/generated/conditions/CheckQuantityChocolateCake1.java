package uk.ac.york.eng2.products.resources.offers.generated.conditions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
* Auto-generated condition handler for condition: Check Quantity Chocolate Cake = 1
*/
public class CheckQuantityChocolateCake1 {

	private List<String> applicableProducts;
	private int minQuantity;

	public CheckQuantityChocolateCake1() {
		this.applicableProducts = Arrays.asList("Chocolate Cake");
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
		return "Check Quantity Chocolate Cake = 1";
	}
}