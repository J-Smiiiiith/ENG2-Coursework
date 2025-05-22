package uk.ac.york.eng2.products.resources.offers.generated.conditions.quantity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
* Auto-generated condition handler for condition: Check 2 Large Pizzas
*/
public class Check2LargePizzas {

	private List<String> applicableProducts;
	private int minQuantity;

	public Check2LargePizzas() {
		this.applicableProducts = Arrays.asList("Large Pizza");
		this.minQuantity = 2;
	}

	public boolean checkConditions(Map<String, Integer> order) {
		int count = 0;

		for (String product : applicableProducts) {
			if (order.containsKey(product)) {
				count += order.get(product);
			}
		}

		return count >= minQuantity;
	}

	public String getConditionName() {
		return "Check 2 Large Pizzas";
	}
}