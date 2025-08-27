/*Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)*/
import java.time.*;
import java.time.format.DateTimeFormatter;
	//import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class datetime1 {
	public static void main(String[] args){
		//Scanner scanner = new Scanner(System.in);
        LocalTime ctime = LocalTime.now();
        System.out.println("Current Time: " + ctime);
        ZonedDateTime ctime2=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + ctime2);
        ZonedDateTime ctime3=ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(ctime3);

	}
}
