package uk.ac.york.eng2.products.resources.offers.generated.conditions.min_price;

/**
* Auto-generated condition handler for condition: Check £50 min price
*/
public class Check50minprice {

	private float minPrice;

	public Check50minprice() {
		this.minPrice = 50.0f;
	}

	public boolean checkConditions(float totalPrice) {
		return totalPrice >= this.minPrice;
	}

	public String getConditionName() {
		return "Check £50 min price";
	}

	public float getMinPrice() {
		return this.minPrice;
	}
}