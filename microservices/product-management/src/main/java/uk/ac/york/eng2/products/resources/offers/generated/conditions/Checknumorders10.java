package uk.ac.york.eng2.products.resources.offers.generated.conditions;

/**
* Auto-generated condition handler for condition: Check num orders = 10
*/
public class Checknumorders10 {

	private int numOrders;

	public Checknumorders10() {
		this.numOrders = 10;
	}

	public boolean checkCondition(int totalOrders) {
		return numOrders <= totalOrders;
	}

	public String getConditionName() {
		return "Check num orders = 10";
	}

	public int getNumOrders() {
		return this.numOrders;
	}
}