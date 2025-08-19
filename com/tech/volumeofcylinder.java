import java.util.*;5
public class volumeofcylinder {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the radius of the cylinder:");
	    int a=sc.nextInt();
	    System.out.print("height of cylinder:");
	    int h=sc.nextInt();
	    double sum=3.14*a*a*h;
		System.out.println("volume of cylinder  is :"+sum);
	}

}
