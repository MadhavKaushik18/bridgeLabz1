package com;
import java.util.Scanner;
public class flowcontrol_level2 {
	public static void main(String[] args) {
        oddEvenNumbers();
        employeeBonus();
        multiplicationTable();
        fizzBuzzFor();
        fizzBuzzWhile();
        youngestTallestFriend();
        factorsWithFor();
        factorsWithWhile();
        greatestFactorFor();
        greatestFactorWhile();
        multiplesBelow100For();
        powerWithFor();
        multiplesBelow100While();
        powerWithWhile();
    }

    // 1. Odd/Even numbers from 1 to user input
    public static void oddEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Not a natural number.");
        }
    }

    // 2. Employee bonus based on years of service
    public static void employeeBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            System.out.println("Bonus: " + (salary * 0.05));
        } else {
            System.out.println("No bonus.");
        }
    }

    // 3. Multiplication table from 6 to 9
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // 4. FizzBuzz using for loop
    public static void fizzBuzzFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
            }
        } else {
            System.out.println("Not a positive integer.");
        }
    }

    // 5. FizzBuzz using while loop
    public static void fizzBuzzWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int i = 1;
        if (n > 0) {
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Not a positive integer.");
        }
    }

    // 6. Youngest and tallest among 3 friends
    public static void youngestTallestFriend() {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest is: " + names[youngestIndex]);
        System.out.println("Tallest is: " + names[tallestIndex]);
    }

    // 7. Factors using for loop
    public static void factorsWithFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }

    // 8. Factors using while loop
    public static void factorsWithWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }

    // 9. Greatest factor (except itself) using for loop
    public static void greatestFactorFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (except itself): " + greatestFactor);
    }

    // 10. Greatest factor using while loop
    public static void greatestFactorWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i = number - 1;
        int greatestFactor = 1;
        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor (except itself): " + greatestFactor);
    }

    // 11. Multiples of a number below 100 using for loop
    public static void multiplesBelow100For() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();
        for (int i = 1; i < 100; i++) {
            if (i % number == 0)
                System.out.println(i);
        }
    }

    // 12. Power of number using for loop
    public static void powerWithFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to " + power + " is " + result);
    }

    // 13. Multiples of number below 100 using while loop
    public static void multiplesBelow100While() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();
        int i = 1;
        while (i < 100) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // 14. Power of number using while loop
    public static void powerWithWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int i = 1;
        while (i <= power) {
            result *= number;
            i++;
        }

        System.out.println(number + " raised to " + power + " is " + result);
    }

}
