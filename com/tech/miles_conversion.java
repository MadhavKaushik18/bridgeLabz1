package com.tech;
import java.util.*;
public class miles_conversion {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the number of kilometer:");
	    int a=sc.nextInt();
	    double miles=a*0.621371;
	    
		System.out.println("no.of miles in given kilometer:"+miles);
	}

}
