/*2. Problem 2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.*/
import java.time.*;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.time.temporal.ChronoUnit;
public class datetime2 {
        public static void main(String [] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter date: dd-MM-yyy");
        	String s=sc.nextLine();
        	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        	LocalDate date=LocalDate.parse(s,f);
        	System.out.println("current date"+" "+date);
        	System.out.println("enter the no.of days to be added");
        	int a=sc.nextInt();
;        	LocalDate pdate=date.plusDays(a);
        	System.out.println("current date after adding days"+" "+pdate);
        	System.out.println("enter the no.of months to be added");
        	int b=sc.nextInt();
        	LocalDate mdate=date.plusMonths(b);
        	System.out.println("current date after adding Months"+" "+mdate);
        	System.out.println("enter the no.of years to be added");
        	int c=sc.nextInt();
        	LocalDate ydate=date.plusYears(c);
        	System.out.println("current date after adding years"+" "+ydate);
        	System.out.println("enter the no.of weeks to be deleted");
        	int d=sc.nextInt();
        	LocalDate wdate=date.minusWeeks(d);
        	System.out.println("current date after deleting weeks"+" "+wdate);
        }
}
