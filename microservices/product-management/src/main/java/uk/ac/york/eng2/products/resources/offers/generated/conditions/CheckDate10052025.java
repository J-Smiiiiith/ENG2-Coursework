package uk.ac.york.eng2.products.resources.offers.generated.conditions;

/**
* Auto-generated condition handler for condition: Check Date 10/05/2025
*/
public class CheckDate10052025 {

	private String date;

	public CheckDate10052025() {
		this.date = "10/05/2025";
	}

	public boolean checkCondition(String dateToCheck) {
		return this.date.equals(dateToCheck);
	}

	public String getConditionName() {
		return "Check Date 10/05/2025";
	}

	public String getDate() {
		return this.date;
	}
}