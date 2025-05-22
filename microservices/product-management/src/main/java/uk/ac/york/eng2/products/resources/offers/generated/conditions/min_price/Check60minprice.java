package uk.ac.york.eng2.products.resources.offers.generated.conditions.min_price;

/**
* Auto-generated condition handler for condition: Check £60 min price
*/
public class Check60minprice {

	private float minPrice;

	public Check60minprice() {
		this.minPrice = 60.0f;
	}

	public boolean checkCondition(float totalPrice) {
		return totalPrice >= this.minPrice;
	}

	public String getConditionName() {
		return "Check £60 min price";
	}

	public float getMinPrice() {
		return this.minPrice;
	}
}