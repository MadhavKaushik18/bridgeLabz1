/*Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
*/
package com;
public class Vehicle {
	private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0; 
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.printf("Registration Fee: $%.2f%n", registrationFee);
        System.out.println("-----------------------------");
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

	public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(150.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();


	}

}
