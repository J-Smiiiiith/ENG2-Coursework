package uk.ac.york.eng2.products.resources.offers.generated.conditions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
* Auto-generated condition handler for condition: CheckQuantity Ice Cream
*/
public class CheckQuantityIceCream {

	private List<String> applicableProducts;
	private int minQuantity;

	public CheckQuantityIceCream() {
		this.applicableProducts = Arrays.asList("Ice Cream");
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
		return "CheckQuantity Ice Cream";
	}
}