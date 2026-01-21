/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius
 *  with default and user-provided values.*/
package com;
import java.util.*;
public class circle {
     private double radius;

    
     public circle() {
         this(1.0); 
     }
     public circle(double radius) {
         this.radius = radius;
     }
     public double getArea() {
         return Math.PI * radius * radius;
     }

     // Display method
     public void displayInfo() {
         System.out.println("Radius: " + radius);
         System.out.printf("Area: %.2f%n", getArea());
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle();
		c1.displayInfo();
		circle c2=new circle(5.0);
		c2.displayInfo();

	}

}
