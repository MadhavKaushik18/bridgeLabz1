package com;
import java.util.Scanner;
public class flowcontrol_level1 {
	public static void main(String[] args) {
        // Call each program here

        program1();
        program2();
        program3();
        program4();
        program5();
        program6();
        program7();
        program8();
        program9();
        program10();
        program11();
        program12();
        program13();
        program14();
        program15();
        program16();
        program17();
        program18();
    }

    // 1. Divisible by 5
    public static void program1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
    }

    // 2. First is smallest of 3
    public static void program2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
    }

    // 3. Which number is the largest
    public static void program3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));
    }

    // 4. Sum of n natural numbers
    public static void program4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting eligibility
    public static void program5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }

    // 6. Positive, negative, or zero
    public static void program6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    // 7. Spring season
    public static void program7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        boolean spring = (month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20);
        System.out.println(spring ? "It's a Spring Season" : "Not a Spring Season");
    }

    // 8. Countdown with while loop
    public static void program8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int count = sc.nextInt();
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Rocket Launched!");
    }

    // 9. Countdown with for loop
    public static void program9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int count = sc.nextInt();
        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }

    // 10. Sum until user enters 0
    public static void program10() {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
            total += num;
        } while (num != 0);
        System.out.println("Total sum: " + total);
    }

    // 11. Sum until 0 or negative (with break)
    public static void program11() {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0)
                break;
            total += num;
        }
        System.out.println("Total sum: " + total);
    }

    // 12. Sum using while loop and formula
    public static void program12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int formula = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum using formula: " + formula);
            System.out.println("Sum using loop: " + sum);
            System.out.println("Both equal? " + (formula == sum));
        } else {
            System.out.println("Not a natural number.");
        }
    }

    // 13. Same as above using for loop
    public static void program13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int formula = n * (n + 1) / 2;
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += i;
            System.out.println("Sum using formula: " + formula);
            System.out.println("Sum using loop: " + sum);
            System.out.println("Both equal? " + (formula == sum));
        } else {
            System.out.println("Not a natural number.");
        }
    }

    // 14. Factorial using while loop
    public static void program14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Invalid input!");
        }
    }

    // 15. Factorial using for loop
    public static void program15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Invalid input!");
        }
    }

    // 16. Odd and Even numbers from 1 to N
    public static void program16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Not a natural number.");
        }
    }

    // 17. Bonus for employees
    public static void program17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
    // 18. Multiplication table from 6 to 9
    public static void program18() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int number = sc.nextInt();
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

}}
