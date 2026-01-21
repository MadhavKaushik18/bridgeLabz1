package com;
import java.util.Scanner;
public class arrays_level2 {
	// 1. Employee Bonus Calculation
    public static void employeeBonus(Scanner sc) {
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }

    // 2. Youngest & Tallest among Amar, Akbar, Anthony
    public static void youngestTallest(Scanner sc) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest is " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest is " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
    }

    // 3. Largest & Second Largest Digit (Dynamic Array)
    public static void largestDigits(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + second);
    }

    // 4. Reverse Number using Array
    public static void reverseNumber(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = String.valueOf(number).length();
        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number = ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

    // 5. BMI of Persons (1D Arrays)
    public static void bmi1D(Scanner sc) {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (m): ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " → H=" + height[i] + "m, W=" + weight[i] + "kg, BMI=" + bmi[i] + ", Status=" + status[i]);
        }
    }

    // 6. BMI of Persons (2D Array)
    public static void bmi2D(Scanner sc) {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (m): ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " → H=" + personData[i][1] + "m, W=" + personData[i][0] + "kg, BMI=" + personData[i][2] + ", Status=" + status[i]);
        }
    }

    // 7. Student Marks → Percentage & Grade (1D)
    public static void studentGrades1D(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] math = new double[n];
        double[] perc = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            phy[i] = sc.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            chem[i] = sc.nextDouble();
            System.out.print("Enter Maths marks: ");
            math[i] = sc.nextDouble();

            perc[i] = (phy[i] + chem[i] + math[i]) / 3;

            if (perc[i] >= 90) grade[i] = "A";
            else if (perc[i] >= 75) grade[i] = "B";
            else if (perc[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " → %=" + perc[i] + ", Grade=" + grade[i]);
        }
    }

    // 8. Student Marks → Percentage & Grade (2D)
    public static void studentGrades2D(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] perc = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks: ");
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            perc[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (perc[i] >= 90) grade[i] = "A";
            else if (perc[i] >= 75) grade[i] = "B";
            else if (perc[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " → %=" + perc[i] + ", Grade=" + grade[i]);
        }
    }

    // 9. Frequency of Digits
    public static void digitFrequency(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] freq = new int[10];

        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + " → " + freq[i]);
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU (Array Programs 2) =====");
            System.out.println("1. Employee Bonus");
            System.out.println("2. Youngest & Tallest");
            System.out.println("3. Largest & 2nd Largest Digit");
            System.out.println("4. Reverse Number");
            System.out.println("5. BMI (1D Arrays)");
            System.out.println("6. BMI (2D Array)");
            System.out.println("7. Student Grades (1D)");
            System.out.println("8. Student Grades (2D)");
            System.out.println("9. Digit Frequency");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> employeeBonus(sc);
                case 2 -> youngestTallest(sc);
                case 3 -> largestDigits(sc);
                case 4 -> reverseNumber(sc);
                case 5 -> bmi1D(sc);
                case 6 -> bmi2D(sc);
                case 7 -> studentGrades1D(sc);
                case 8 -> studentGrades2D(sc);
                case 9 -> digitFrequency(sc);
                case 0 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

}
