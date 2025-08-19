 /*Add a static variable numberOfCars in the Car class from Q1 to count 
 how many objects have been created.*/
package com.tech;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car("toyota",2021);
		car c2=new car("maruti",2023);
		System.out.print(car.numbersofcars);

	}}
class car{
	String model;
	int year;
    static int numbersofcars=0;
    public car( String model, int year) {
        this.model = model;
        this.year = year;

        // Increment the static variable when a new object is created
        numbersofcars++;
    }
}


