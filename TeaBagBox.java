/*
 * Author/modified by: Jonathan Regis 	
 * Professor: Wafa Hassanain
 * Date: Jan 28th 2023
 * Description: Lab Exam 02 (22F) Section 332
 */

/*
 * this class represents a TeaBagBox object, that will calculate the total weight of a tea bag box with user inputs 
 * as well as check if its within range or not ( range is between 0 and 332 grams) 
 */

public class TeaBagBox {
	private double bagWeight;  // in grams
	private double bagCount;
	
	/*
	 * no argument constructor, sets fields to zero
	 */
	public TeaBagBox() {
		this(0.0,0.0);
	}
	
	/*
	 * argument constructor
	 */
	public TeaBagBox(double bagWeight, double bagCount) {
			this.bagWeight = bagWeight;
			this.bagCount = bagCount;
	}
	
	/*
	 * accessor for bagWeight
	 */
	public double getBagWeight() {
		return bagWeight;
	}
	
	/*
	 * mutator for bagWeight 
	 */
	public void setBagWeight(double bagWeight) {
		this.bagWeight = bagWeight;
	}
	
	/*
	 * accessor for bagCount
	 */
	public double getBagCount() {
		return bagCount;
	}
	
	/*
	 * mutator for bagCount 
	 */
	public void setBagCount(double bagCount) {
		this.bagCount = bagCount;
	}
	
	/*
	 * This worker method calculates the total weight of 
	 * a box of tea bags
	 * using the bagWeight and bagCount fields.
	 */
	public double calculateTotalWeight() {
		double totalWeight = bagWeight * bagCount;
		return totalWeight;
	}

	/*
	 * This method will check the total weight of the bag 
	 * and decide whether it is within range or not.
	 */
	public String checkTotalWeight(){
		String report;
		double weight;
		report = null;
		weight = calculateTotalWeight();
		if (weight <0) {
			report = "total weight invalid";
		}
		else {
			if(weight >332) {
				report = "total weight too high";
			}
			else {
				if(weight>0 || weight>332) {
					report = "total weight within range";
			}
		}
	    
	}
		return report;
	
	}
}
