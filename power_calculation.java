import java.util.*;
import java.lang.Math;
public class power_calculation {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the base value:");
	    double base=sc.nextInt();
	    System.out.print("enter the exponent value:");
	    double exponent=sc.nextInt();
	   
	    double power=Math.pow(base,exponent);
		System.out.println("power calculation of the given base is:"+power);
	}

}
