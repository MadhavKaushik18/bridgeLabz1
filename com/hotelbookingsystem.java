/*Hotel Booking System: Create a HotelBooking class with attributes guestName, 
 * roomType, and nights. Use default, parameterized, and copy 
 * constructors to initialize bookings.
*/
package com;

public class hotelbookingsystem {
    String guestName;
    String roomtype;
    int nights;
    hotelbookingsystem(String guestName,String roomtype,int nights){
    	this.guestName=guestName;
    	this.roomtype=roomtype;
    	this.nights=nights;
    }
    hotelbookingsystem(hotelbookingsystem other){
    	this.guestName=other.guestName;
    	this.roomtype=other.roomtype;
    	this.nights=other.nights;
    }
    void displayInfo() {
    	System.out.println("Name"+guestName);
    	System.out.println("Roomtype:"+roomtype);
    	System.out.println("nights:"+nights);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hotelbookingsystem h1=new hotelbookingsystem("madhav","premium",56);
		h1.displayInfo();
		hotelbookingsystem h2=new hotelbookingsystem(h1);
		h2.displayInfo();
		

	}

}
