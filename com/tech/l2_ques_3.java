/*Create a program to store the digits of the number in an array and
 *  find the largest and second largest element of the array.
 */

package com.tech;
import java.util.Arrays;
import java.util.*;
public class l2_ques_3 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		int a=n;
		int cnt=0;
		while(a!=0) {
			a/=10;
			cnt++;
			
		}
		int [] arr=new int[cnt];
		int i=0;
		while(n!=0) {
			int rem=n%10;
			arr[i]=rem;
			int q=n/10;
			n=q;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	
	int max=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]>max){
			max2=Math.max(max, max2);
			max=arr[j];
			}
		else if(arr[j]>max2){
			max2=arr[j];
		}
		}
	
	System.out.println("max value"+max);
	System.out.println("max2 value"+max2);
}}

