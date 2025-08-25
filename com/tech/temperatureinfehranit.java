package com.tech;
import java.util.Scanner;

public class temperatureinfehranit {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the temperature in celsius:");
	    int a=sc.nextInt();
	    int temperature=(a+9/5)+32;
		System.out.println("temperature in farenhit is :"+temperature);
	}
}


