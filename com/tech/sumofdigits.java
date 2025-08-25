package com.tech;
import java.util.*;
public class sumofdigits {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int q=n/10;
			sum+=rem;
			n=q;
		}
		System.out.print("the sum of digits is:"+sum);
	}

}
