import java.util.Scanner;
public class programmingelements {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // question1
	        /*
	        String name = "Harry";
	        int birthYear = 2000;
	        int currentYear = 2024;
	        int age = currentYear - birthYear;
	        System.out.println("Harry's age in 2024 is " + age);
	        */

	        // question2
	        /*
	        String studentName = "Sam";
	        int maths = 94;
	        int physics = 95;
	        int chemistry = 96;
	        double average = (maths + physics + chemistry) / 3.0;
	        System.out.println(studentName + "’s average mark in PCM is " + average);
	        */

	        // question3
	        /*
	        double kilometers = 10.8;
	        double miles = kilometers / 1.6;
	        System.out.println("The distance " + kilometers + " km in miles is " + miles);
	        */

	        // question4
	        /*
	        double costPrice = 129;
	        double sellingPrice = 191;
	        double profit = sellingPrice - costPrice;
	        double profitPercent = (profit / costPrice) * 100;
	        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
	                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	        */

	        // question5
	        /*
	        int totalPens = 14;
	        int students = 3;
	        int pensPerStudent = totalPens / students;
	        int remainingPens = totalPens % students;
	        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	        */

	        // question6
	        /*
	        double fee = 125000;
	        double discountPercent = 10;
	        double discount = fee * discountPercent / 100;
	        double finalFee = fee - discount;
	        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	        */

	        // question7
	        /*
	        double radius = 6378;
	        double pi = 3.141592653589793;
	        double volumeKm = (4.0 / 3) * pi * Math.pow(radius, 3);
	        double volumeMiles = volumeKm / Math.pow(1.6, 3);
	        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
	        */

	        // question8
	        /*
	        double km;
	        System.out.print("Enter distance in km: ");
	        km = sc.nextDouble();
	        double miles = km / 1.6;
	        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
	        */

	        // question9
	        /*
	        double fee, discountPercent;
	        System.out.print("Enter student fee: ");
	        fee = sc.nextDouble();
	        System.out.print("Enter discount percent: ");
	        discountPercent = sc.nextDouble();
	        double discount = fee * discountPercent / 100;
	        double finalFee = fee - discount;
	        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	        */

	        // question10
	        /*
	        double heightCm;
	        System.out.print("Enter your height in cm: ");
	        heightCm = sc.nextDouble();
	        double totalInches = heightCm / 2.54;
	        int feet = (int) totalInches / 12;
	        double inches = totalInches % 12;
	        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
	        */

	        // question11
	        /*
	        double number1, number2;
	        System.out.print("Enter number 1: ");
	        number1 = sc.nextDouble();
	        System.out.print("Enter number 2: ");
	        number2 = sc.nextDouble();
	        double addition = number1 + number2;
	        double subtraction = number1 - number2;
	        double multiplication = number1 * number2;
	        double division = number1 / number2;
	        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 +
	                " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
	        */

	        // question12
	        /*
	        double base, height;
	        System.out.print("Enter base of triangle (cm): ");
	        base = sc.nextDouble();
	        System.out.print("Enter height of triangle (cm): ");
	        height = sc.nextDouble();
	        double areaCm = 0.5 * base * height;
	        double areaInch = areaCm / 6.4516;
	        System.out.println("The area of triangle is " + areaCm + " sq. cm and " + areaInch + " sq. inches");
	        */

	        // question13
	        /*
	        double perimeter;
	        System.out.print("Enter perimeter of square: ");
	        perimeter = sc.nextDouble();
	        double side = perimeter / 4;
	        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	        */

	        // question14
	        /*
	        double distanceInFeet;
	        System.out.print("Enter distance in feet: ");
	        distanceInFeet = sc.nextDouble();
	        double yards = distanceInFeet / 3;
	        double miles = yards / 1760;
	        System.out.println("The distance is " + distanceInFeet + " feet, which is " + yards + " yards and " + miles + " miles");
	        */

	        // question15
	        /*
	        double unitPrice;
	        int quantity;
	        System.out.print("Enter unit price: ");
	        unitPrice = sc.nextDouble();
	        System.out.print("Enter quantity: ");
	        quantity = sc.nextInt();
	        double totalPrice = unitPrice * quantity;
	        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	        */

	        // question16
	        
	      /*  int numberOfStudents;
	        System.out.print("Enter number of students: ");
	        numberOfStudents = sc.nextInt();
	        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
	        System.out.println("The number of possible handshakes is " + handshakes);
	        */
	        System.out.print(4%2);
	        }
	}

