package com;
import java.util.Scanner;
public class Arrays_level1 {
	    // 1. Age Voting Check for 10 Students
	    public static void ageVotingCheck(Scanner sc) {
	        int[] ages = new int[10];
	        System.out.println("Enter ages of 10 students:");
	        for (int i = 0; i < ages.length; i++) {
	            ages[i] = sc.nextInt();
	        }
	        for (int age : ages) {
	            if (age < 0) {
	                System.out.println("Invalid age: " + age);
	            } else if (age >= 18) {
	                System.out.println("Student with age " + age + " can vote.");
	            } else {
	                System.out.println("Student with age " + age + " cannot vote.");
	            }
	        }
	    }

	    // 2. Positive, Negative, Zero, Even, Odd + Compare first and last
	    public static void numberAnalysis(Scanner sc) {
	        int[] arr = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        for (int num : arr) {
	            if (num > 0) {
	                if (num % 2 == 0) System.out.println(num + " is Positive Even");
	                else System.out.println(num + " is Positive Odd");
	            } else if (num < 0) {
	                System.out.println(num + " is Negative");
	            } else {
	                System.out.println(num + " is Zero");
	            }
	        }
	        if (arr[0] == arr[4]) System.out.println("First and last are equal");
	        else if (arr[0] > arr[4]) System.out.println("First is greater than last");
	        else System.out.println("First is less than last");
	    }

	    // 3. Multiplication Table of one number
	    public static void multiplicationTable(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int[] table = new int[10];
	        for (int i = 0; i < 10; i++) {
	            table[i] = number * (i + 1);
	        }
	        for (int i = 0; i < 10; i++) {
	            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
	        }
	    }

	    // 4. Store multiple values until 0, negative or 10 numbers
	    public static void storeValues(Scanner sc) {
	        double[] arr = new double[10];
	        double total = 0.0;
	        int index = 0;
	        while (true) {
	            System.out.print("Enter a number (0 or negative to stop): ");
	            double num = sc.nextDouble();
	            if (num <= 0 || index == 10) break;
	            arr[index++] = num;
	        }
	        for (int i = 0; i < index; i++) {
	            total += arr[i];
	            System.out.println("Value[" + i + "] = " + arr[i]);
	        }
	        System.out.println("Sum = " + total);
	    }

	    // 5. Multiplication Table of a number from 6 to 9
	    public static void tableSixToNine(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int[] result = new int[4];
	        for (int i = 6; i <= 9; i++) {
	            result[i - 6] = number * i;
	        }
	        for (int i = 6; i <= 9; i++) {
	            System.out.println(number + " * " + i + " = " + result[i - 6]);
	        }
	    }

	    // 6. Mean Height of 11 players
	    public static void meanHeight(Scanner sc) {
	        double[] heights = new double[11];
	        double sum = 0.0;
	        System.out.println("Enter heights of 11 players:");
	        for (int i = 0; i < heights.length; i++) {
	            heights[i] = sc.nextDouble();
	            sum += heights[i];
	        }
	        double mean = sum / heights.length;
	        System.out.println("Mean Height = " + mean);
	    }

	    // 7. Save Odd and Even numbers in separate arrays
	    public static void oddEvenArrays(Scanner sc) {
	        System.out.print("Enter a natural number: ");
	        int number = sc.nextInt();
	        if (number <= 0) {
	            System.out.println("Error: Not a natural number!");
	            return;
	        }
	        int[] evens = new int[number / 2 + 1];
	        int[] odds = new int[number / 2 + 1];
	        int eIndex = 0, oIndex = 0;

	        for (int i = 1; i <= number; i++) {
	            if (i % 2 == 0) evens[eIndex++] = i;
	            else odds[oIndex++] = i;
	        }

	        System.out.print("Even Numbers: ");
	        for (int i = 0; i < eIndex; i++) System.out.print(evens[i] + " ");
	        System.out.println();
	        System.out.print("Odd Numbers: ");
	        for (int i = 0; i < oIndex; i++) System.out.print(odds[i] + " ");
	        System.out.println();
	    }

	    // 8. Factors of a number
	    public static void factorsOfNumber(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int maxFactor = 10;
	        int[] factors = new int[maxFactor];
	        int index = 0;

	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                if (index == maxFactor) {
	                    maxFactor *= 2;
	                    int[] temp = new int[maxFactor];
	                    System.arraycopy(factors, 0, temp, 0, factors.length);
	                    factors = temp;
	                }
	                factors[index++] = i;
	            }
	        }

	        System.out.print("Factors of " + number + ": ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(factors[i] + " ");
	        }
	        System.out.println();
	    }

	    // 9. Copy 2D Array to 1D Array
	    public static void copy2DTo1D(Scanner sc) {
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of cols: ");
	        int cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];
	        System.out.println("Enter elements of matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        int[] arr = new int[rows * cols];
	        int index = 0;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr[index++] = matrix[i][j];
	            }
	        }

	        System.out.println("1D Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    // 10. FizzBuzz with Array
	    public static void fizzBuzz(Scanner sc) {
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        if (number <= 0) {
	            System.out.println("Invalid input!");
	            return;
	        }
	        String[] arr = new String[number + 1];
	        for (int i = 0; i <= number; i++) {
	            if (i % 3 == 0 && i % 5 == 0) arr[i] = "FizzBuzz";
	            else if (i % 3 == 0) arr[i] = "Fizz";
	            else if (i % 5 == 0) arr[i] = "Buzz";
	            else arr[i] = String.valueOf(i);
	        }
	        for (int i = 0; i <= number; i++) {
	            System.out.println("Position " + i + " = " + arr[i]);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n===== MENU (Array Programs) =====");
	            System.out.println("1. Age Voting Check");
	            System.out.println("2. Number Analysis (pos/neg/even/odd/compare)");
	            System.out.println("3. Multiplication Table (1 number)");
	            System.out.println("4. Store Values (max 10)");
	            System.out.println("5. Multiplication Table (6 to 9)");
	            System.out.println("6. Mean Height of Players");
	            System.out.println("7. Odd and Even Arrays");
	            System.out.println("8. Factors of a Number");
	            System.out.println("9. Copy 2D to 1D Array");
	            System.out.println("10. FizzBuzz");
	            System.out.println("0. Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1: ageVotingCheck(sc); break;
	                case 2: numberAnalysis(sc); break;
	                case 3: multiplicationTable(sc); break;
	                case 4: storeValues(sc); break;
	                case 5: tableSixToNine(sc); break;
	                case 6: meanHeight(sc); break;
	                case 7: oddEvenArrays(sc); break;
	                case 8: factorsOfNumber(sc); break;
	                case 9: copy2DTo1D(sc); break;
	                case 10: fizzBuzz(sc); break;
	                case 0: System.out.println("Exiting..."); return;
	                default: System.out.println("Invalid choice!");
	            }
	        }
	    }
	}
