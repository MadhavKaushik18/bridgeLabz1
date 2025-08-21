package com.tech;
import java.util.*;
public class simpleinterest {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the principle amount:");
	    int p=sc.nextInt();
	    System.out.print("enter the interest rate:");
	    float r=sc.nextInt();
	    System.out.print("enter the time period");
	    int t=sc.nextInt();
	    double SI=(p*r*t)/100;
		System.out.println("simple interest of the principle amount is:"+SI);
	}

}
