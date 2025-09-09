/*Car Rental System: Create a CarRental class with attributes customerName, 
 * carModel, and rentalDays.
 *  Add constructors to initialize the rental details and calculate total cost.*/
package com;
public class carrental {
	 private String customerName;
	    private String carModel;
	    private int rentalDays;

	    
	    private final double DAILY_RATE = 50.0;  
	    public carrental() {
	        this.customerName = "Unknown Customer";
	        this.carModel = "Standard";
	        this.rentalDays = 1;
	    }
	    public carrental(String customerName, String carModel, int rentalDays) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	    }

	    // Method to calculate total cost
	    public double calculateTotalCost() {
	        return DAILY_RATE * rentalDays;
	    }
	    public void displayRentalDetails() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Car Model: " + carModel);
	        System.out.println("Rental Days: " + rentalDays);
	        System.out.printf("Total Cost: $%.2f%n", calculateTotalCost());
	        System.out.println("---------------------------");
	    }
	public static void main(String[] args) {
		carrental c1=new carrental();
		c1.displayRentalDetails();
		carrental c2=new carrental("Madhav","Toyota",45);
		c2.displayRentalDetails();
	}

}
