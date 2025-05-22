package uk.ac.york.eng2.products.resources.offers.generated.conditions;

/**
* Auto-generated condition handler for condition: Check Christmas Day
*/
public class CheckChristmasDay {

	private String date;

	public CheckChristmasDay() {
		this.date = "25/12/2026";
	}

	public boolean checkCondition(String dateToCheck) {
		return this.date.equals(dateToCheck);
	}

	public String getConditionName() {
		return "Check Christmas Day";
	}

	public String getDate() {
		return this.date;
	}
}