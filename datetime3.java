/*3. Problem 3: Date Formatting Write a program that:
➢ Displays the current date in three different formats:
■ dd/MM/yyyy
■ yyyy-MM-dd
■ EEE, MMM dd, yyyy

Hint: Use DateTimeFormatter with custom patterns for date formatting.*/
import java.time.*;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.time.temporal.ChronoUnit;
public class datetime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter date: dd-MM-yyyy");
    	String s=sc.nextLine();
    	System.out.println("enter date:yyyy-MM-dd");
    	String s1=sc.nextLine();
    	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	DateTimeFormatter f1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate date=LocalDate.parse(s,f);
    	String g=date.format(f);
    	System.out.println("the date in format:dd-MM-yyyy"+" "+g);
    	LocalDate date1=LocalDate.parse(s1,f1);
    	String h=date1.format(f1);
    	System.out.println("the date in format:yyyy-MM-dd"+" "+h);
	}

}
