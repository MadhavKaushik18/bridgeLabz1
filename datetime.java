import java.time.*;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	import java.time.temporal.ChronoUnit;
public class datetime {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
			System.out.println("enter date:dd-mm-yyyy");
			String inputdate=sc.nextLine();
			DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date=LocalDate.parse(inputdate,format);
			System.out.println(date);
			DayOfWeek dayofweek=date.getDayOfWeek();
			System.out.println(dayofweek);
			LocalDate cdate=LocalDate.now();
			long diff=ChronoUnit.DAYS.between(date,cdate);
			System.out.println("difference between cdate and date:"+" "+diff);
			//DateTime
			DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			LocalDateTime cdatetime=LocalDateTime.now();
			System.out.println("currentdate and time:"+" "+cdatetime);
			}
	}

