package com.tech;
import java.util.*;
public class average_of_threenumbers {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the first no.:");
	    int a=sc.nextInt();
	    System.out.print("enter the second no.:");
	    int b=sc.nextInt();
	    System.out.print("enter the third no.");
	    int c=sc.nextInt();
	    double average=(a+b+c)/3;
		System.out.println("average of the given no. is:"+average);
	}


}
