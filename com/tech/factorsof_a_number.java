/*Create a program to find the factors of a number taken as user input,
 *  store the factors in an array, and display the factors
 */

package com.tech;
import java.util.Arrays;
import java.util.Scanner;
public class factorsof_a_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int cnt=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				cnt++;
			}
		}
		int k=0;
		int arr[]=new int[cnt];
		while(i<=n) {
			if(n%i==0) {
				arr[k]=i;
				k++;
				
			}
			i++;
		}

		System.out.println(Arrays.toString(arr));
		
		
	}

}
