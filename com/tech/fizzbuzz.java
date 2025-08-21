package com.tech;
import java.util.Arrays;
import java.util.Scanner;
public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String [] arr=new String[n+1];
       for(int i=0;i<=n;i++) {
    	   if(i%3==0 && i%5==0) {
    		   arr[i]="FizzBuzz";
    	   }
    	   else if(i%3==0) {
    		   arr[i]="Fizz";
    		   
    		   }
    	   else if(i%5==0) {
    		   arr[i]="Buzz";
    		   
    	   }
    	   else {
    		   arr[i]=""+i;
    	   }
    	   }
       System.out.println(Arrays.toString(arr));
	}

}
