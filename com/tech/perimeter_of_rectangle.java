import java.util.*;
public class perimeter_of_rectangle {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the length:");
	    int l=sc.nextInt();
	    System.out.print("enter the width:");
	    int b=sc.nextInt();
	   
	    int perimeter=2*(l+b);
		System.out.println("perimeter of the rectangle is:"+perimeter);
	}

}
