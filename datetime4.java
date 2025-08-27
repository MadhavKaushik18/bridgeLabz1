/*Problem 4: Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.*/
import java.time.*;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.time.temporal.ChronoUnit;
public class datetime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter date1: dd-MM-yyy");
    	String s=sc.nextLine();
    	System.out.println("enter date2: dd-MM-yyy");
    	String s1=sc.nextLine();
    	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	LocalDate date=LocalDate.parse(s,f);
    	LocalDate date1=LocalDate.parse(s1,f);
    	System.out.println("date is before or not:"+" "+date.isBefore(date1));
    	System.out.println("date is after or not:"+" "+date.isAfter(date1));
    	System.out.println("date is before or not:"+" "+date.isEqual(date1));
	}

}
