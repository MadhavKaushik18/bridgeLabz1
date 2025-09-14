package com;
import java.util.Scanner;
public class flowcontrol_level3 {
	// 1. Leap Year Check (Multiple if...else)
	    public static void leapYearIfElse(Scanner sc) {
	        System.out.print("Enter a year: ");
	        int year = sc.nextInt();
	        if (year < 1582) {
	            System.out.println("Invalid Input! Works only for year >= 1582");
	        } else {
	            if (year % 400 == 0) {
	                System.out.println(year + " is a Leap Year");
	            } else if (year % 100 == 0) {
	                System.out.println(year + " is NOT a Leap Year");
	            } else if (year % 4 == 0) {
	                System.out.println(year + " is a Leap Year");
	            } else {
	                System.out.println(year + " is NOT a Leap Year");
	            }
	        }
	    }

	    // 1(b). Leap Year Check (Single if)
	    public static void leapYearSingleIf(Scanner sc) {
	        System.out.print("Enter a year: ");
	        int year = sc.nextInt();
	        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
	            System.out.println(year + " is a Leap Year");
	        } else {
	            System.out.println(year + " is NOT a Leap Year");
	        }
	    }

	    // 2. Marks and Grade
	    public static void marksGrade(Scanner sc) {
	        System.out.print("Enter Physics marks: ");
	        int phy = sc.nextInt();
	        System.out.print("Enter Chemistry marks: ");
	        int chem = sc.nextInt();
	        System.out.print("Enter Maths marks: ");
	        int math = sc.nextInt();

	        double avg = (phy + chem + math) / 3.0;
	        System.out.println("Average Marks = " + avg);

	        if (avg >= 90) System.out.println("Grade: A+ | Remark: Excellent");
	        else if (avg >= 75) System.out.println("Grade: A | Remark: Very Good");
	        else if (avg >= 60) System.out.println("Grade: B | Remark: Good");
	        else if (avg >= 50) System.out.println("Grade: C | Remark: Average");
	        else System.out.println("Grade: F | Remark: Fail");
	    }

	    // 3. Prime Number
	    public static void primeCheck(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        boolean isPrime = true;

	        if (num <= 1) isPrime = false;
	        else {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(isPrime ? num + " is Prime" : num + " is NOT Prime");
	    }

	    // 4. Armstrong Number
	    public static void armstrongCheck(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int originalNumber = number, sum = 0;
	        while (originalNumber != 0) {
	            int digit = originalNumber % 10;
	            sum += digit * digit * digit;
	            originalNumber /= 10;
	        }
	        System.out.println(sum == number ? number + " is Armstrong" : number + " is NOT Armstrong");
	    }

	    // 5. Count Digits
	    public static void digitCount(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt(), count = 0, temp = number;
	        while (temp != 0) {
	            temp /= 10;
	            count++;
	        }
	        System.out.println("Digits in " + number + " = " + count);
	    }

	    // 6. BMI Calculator
	    public static void bmiCalc(Scanner sc) {
	        System.out.print("Enter weight (kg): ");
	        double weight = sc.nextDouble();
	        System.out.print("Enter height (cm): ");
	        double heightCm = sc.nextDouble();
	        double heightM = heightCm / 100;
	        double bmi = weight / (heightM * heightM);
	        System.out.println("BMI = " + bmi);
	        if (bmi < 18.5) System.out.println("Underweight");
	        else if (bmi < 24.9) System.out.println("Normal weight");
	        else if (bmi < 29.9) System.out.println("Overweight");
	        else System.out.println("Obese");
	    }

	    // 7. Harshad Number
	    public static void harshadCheck(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt(), sum = 0, temp = number;
	        while (temp != 0) {
	            sum += temp % 10;
	            temp /= 10;
	        }
	        System.out.println(number % sum == 0 ? number + " is Harshad" : number + " is NOT Harshad");
	    }

	    // 8. Abundant Number
	    public static void abundantCheck(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt(), sum = 0;
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) sum += i;
	        }
	        System.out.println(sum > number ? number + " is Abundant" : number + " is NOT Abundant");
	    }

	    // 9. Calculator using switch
	    public static void calculator(Scanner sc) {
	        System.out.print("Enter first number: ");
	        double first = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double second = sc.nextDouble();
	        System.out.print("Enter operator (+, -, *, /): ");
	        String op = sc.next();
	        switch (op) {
	            case "+": System.out.println("Result = " + (first + second)); break;
	            case "-": System.out.println("Result = " + (first - second)); break;
	            case "*": System.out.println("Result = " + (first * second)); break;
	            case "/": 
	                if (second != 0) System.out.println("Result = " + (first / second));
	                else System.out.println("Error: Division by zero");
	                break;
	            default: System.out.println("Invalid Operator");
	        }
	    }

	    // 10. Day of Week (Zeller’s Formula)
	    public static void dayOfWeek(Scanner sc) {
	        System.out.print("Enter month (1=Jan, ... 12=Dec): ");
	        int m = sc.nextInt();
	        System.out.print("Enter day: ");
	        int d = sc.nextInt();
	        System.out.print("Enter year: ");
	        int y = sc.nextInt();

	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        System.out.println("Day of Week = " + d0 + 
	            " (0=Sunday, 1=Monday, ..., 6=Saturday)");
	    }

	    // MAIN MENU
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n==== MENU ====");
	            System.out.println("1. Leap Year (if-else)");
	            System.out.println("2. Leap Year (single if)");
	            System.out.println("3. Marks & Grade");
	            System.out.println("4. Prime Check");
	            System.out.println("5. Armstrong Check");
	            System.out.println("6. Digit Count");
	            System.out.println("7. BMI Calculator");
	            System.out.println("8. Harshad Check");
	            System.out.println("9. Abundant Check");
	            System.out.println("10. Calculator");
	            System.out.println("11. Day of Week");
	            System.out.println("0. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1: leapYearIfElse(sc); break;
	                case 2: leapYearSingleIf(sc); break;
	                case 3: marksGrade(sc); break;
	                case 4: primeCheck(sc); break;
	                case 5: armstrongCheck(sc); break;
	                case 6: digitCount(sc); break;
	                case 7: bmiCalc(sc); break;
	                case 8: harshadCheck(sc); break;
	                case 9: abundantCheck(sc); break;
	                case 10: calculator(sc); break;
	                case 11: dayOfWeek(sc); break;
	                case 0: System.out.println("Exiting..."); return;
	                default: System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}


