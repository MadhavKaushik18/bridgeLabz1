package com;
import java.util.*;
public class Strings_level3 {
	    // BMI PROGRAM 
	    public static String[][] calculateBMI(double[][] hw) {
	        String[][] result = new String[hw.length][4];
	        for (int i = 0; i < hw.length; i++) {
	            double weight = hw[i][0];
	            double heightM = hw[i][1] / 100.0;
	            double bmi = weight / (heightM * heightM);
	            String status;
	            if (bmi < 18.5) status = "Underweight";
	            else if (bmi < 25) status = "Normal";
	            else if (bmi < 30) status = "Overweight";
	            else status = "Obese";

	            result[i][0] = String.valueOf(hw[i][0]);
	            result[i][1] = String.valueOf(hw[i][1]);
	            result[i][2] = String.format("%.2f", bmi);
	            result[i][3] = status;
	        }
	        return result;
	    }

	    public static void displayBMI(String[][] arr) {
	        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
	        for (String[] row : arr) {
	            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
	        }
	    }

	    public static void bmiProgram(Scanner sc) {
	        double[][] hw = new double[10][2];
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
	            hw[i][0] = sc.nextDouble();
	            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
	            hw[i][1] = sc.nextDouble();
	        }
	        String[][] result = calculateBMI(hw);
	        displayBMI(result);
	    }

	    // UNIQUE CHARACTERS 
	    public static int findLength(String text) {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {}
	        return count;
	    }

	    public static char[] findUniqueChars(String text) {
	        int n = findLength(text);
	        char[] unique = new char[n];
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            char c = text.charAt(i);
	            boolean found = false;
	            for (int j = 0; j < i; j++) {
	                if (text.charAt(j) == c) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) unique[count++] = c;
	        }
	        return Arrays.copyOf(unique, count);
	    }

	    public static void uniqueCharactersProgram(Scanner sc) {
	        System.out.print("Enter a string: ");
	        String text = sc.next();
	        char[] unique = findUniqueChars(text);
	        System.out.println("Unique characters: " + Arrays.toString(unique));
	    }

	    // FIRST NON-REPEATING CHAR
	    public static char findFirstNonRepeating(String text) {
	        int[] freq = new int[256];
	        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
	        for (int i = 0; i < text.length(); i++) {
	            if (freq[text.charAt(i)] == 1) return text.charAt(i);
	        }
	        return 0;
	    }

	    public static void nonRepeatingCharProgram(Scanner sc) {
	        System.out.print("Enter a string: ");
	        String text = sc.next();
	        char result = findFirstNonRepeating(text);
	        if (result == 0) System.out.println("No non-repeating character found.");
	        else System.out.println("First non-repeating character: " + result);
	    }

	    // FREQUENCY USING ASCII 
	    public static String[][] frequencyProgramLogic(String text) {
	        int[] freq = new int[256];
	        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
	        List<String[]> list = new ArrayList<>();
	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);
	            if (freq[c] > 0) {
	                list.add(new String[]{String.valueOf(c), String.valueOf(freq[c])});
	                freq[c] = 0;
	            }
	        }
	        return list.toArray(new String[0][0]);
	    }

	    public static void frequencyProgram(Scanner sc) {
	        System.out.print("Enter a string: ");
	        String text = sc.next();
	        String[][] freq = frequencyProgramLogic(text);
	        System.out.println("Character | Frequency");
	        for (String[] row : freq) {
	            System.out.println("   " + row[0] + "      |    " + row[1]);
	        }
	    }

	    // PALINDROME
	    public static boolean isPalindromeIterative(String text) {
	        int start = 0, end = text.length() - 1;
	        while (start < end) {
	            if (text.charAt(start) != text.charAt(end)) return false;
	            start++;
	            end--;
	        }
	        return true;
	    }

	    public static boolean isPalindromeRecursive(String text, int start, int end) {
	        if (start >= end) return true;
	        if (text.charAt(start) != text.charAt(end)) return false;
	        return isPalindromeRecursive(text, start + 1, end - 1);
	    }

	    public static boolean isPalindromeByReverse(String text) {
	        char[] original = text.toCharArray();
	        char[] reverse = new char[original.length];
	        for (int i = 0; i < original.length; i++) {
	            reverse[i] = text.charAt(original.length - 1 - i);
	        }
	        return Arrays.equals(original, reverse);
	    }

	    public static void palindromeProgram(Scanner sc) {
	        System.out.print("Enter text to check palindrome: ");
	        String text = sc.next();
	        System.out.println("Iterative check: " + isPalindromeIterative(text));
	        System.out.println("Recursive check: " + isPalindromeRecursive(text, 0, text.length() - 1));
	        System.out.println("By Reverse check: " + isPalindromeByReverse(text));
	    }

	    // ANAGRAM 
	    public static boolean isAnagram(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        int[] freq1 = new int[256];
	        int[] freq2 = new int[256];
	        for (int i = 0; i < s1.length(); i++) {
	            freq1[s1.charAt(i)]++;
	            freq2[s2.charAt(i)]++;
	        }
	        return Arrays.equals(freq1, freq2);
	    }

	    public static void anagramProgram(Scanner sc) {
	        System.out.print("Enter first string: ");
	        String s1 = sc.next();
	        System.out.print("Enter second string: ");
	        String s2 = sc.next();
	        System.out.println("Are Anagrams? " + isAnagram(s1, s2));
	    }

	    //CALENDAR 
	    public static boolean isLeapYear(int year) {
	        if (year % 400 == 0) return true;
	        if (year % 100 == 0) return false;
	        return year % 4 == 0;
	    }

	    public static void calendarProgram(Scanner sc) {
	        String[] months = {"January", "February", "March", "April", "May", "June",
	                "July", "August", "September", "October", "November", "December"};
	        int[] daysInMonth = {31, 28, 31, 30, 31, 30,
	                             31, 31, 30, 31, 30, 31};

	        System.out.print("Enter month (1-12): ");
	        int m = sc.nextInt();
	        System.out.print("Enter year: ");
	        int y = sc.nextInt();

	        if (isLeapYear(y)) daysInMonth[1] = 29;

	        // Gregorian algorithm for day of week
	        int d = 1;
	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + (31*m0)/12) % 7;

	        System.out.println("\n  " + months[m-1] + " " + y);
	        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

	        for (int i = 0; i < d0; i++) System.out.print("    ");
	        for (int day = 1; day <= daysInMonth[m-1]; day++) {
	            System.out.printf("%3d ", day);
	            if ((day + d0) % 7 == 0) System.out.println();
	        }
	        System.out.println();
	    }

	    //  DECK OF CARDS
	    public static String[] initializeDeck() {
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        String[] ranks = {"2","3","4","5","6","7","8","9","10",
	                          "Jack","Queen","King","Ace"};
	        int n = suits.length * ranks.length;
	        String[] deck = new String[n];
	        int index = 0;
	        for (String suit : suits) {
	            for (String rank : ranks) {
	                deck[index++] = rank + " of " + suit;
	            }
	        }
	        return deck;
	    }

	    public static void shuffleDeck(String[] deck) {
	        for (int i = 0; i < deck.length; i++) {
	            int r = i + (int)(Math.random() * (deck.length - i));
	            String temp = deck[i];
	            deck[i] = deck[r];
	            deck[r] = temp;
	        }
	    }

	    public static void distributeCards(Scanner sc, String[] deck) {
	        System.out.print("Enter number of players: ");
	        int players = sc.nextInt();
	        System.out.print("Enter number of cards per player: ");
	        int cards = sc.nextInt();

	        if (players * cards > deck.length) {
	            System.out.println("Not enough cards to distribute!");
	            return;
	        }

	        String[][] playerCards = new String[players][cards];
	        int index = 0;
	        for (int i = 0; i < players; i++) {
	            for (int j = 0; j < cards; j++) {
	                playerCards[i][j] = deck[index++];
	            }
	        }

	        for (int i = 0; i < players; i++) {
	            System.out.println("Player " + (i+1) + ": " + Arrays.toString(playerCards[i]));
	        }
	    }

	    public static void deckOfCardsProgram(Scanner sc) {
	        String[] deck = initializeDeck();
	        shuffleDeck(deck);
	        distributeCards(sc, deck);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n MENU ");
	            System.out.println("1. BMI Program");
	            System.out.println("2. Unique Characters");
	            System.out.println("3. First Non-Repeating Character");
	            System.out.println("4. Frequency of Characters");
	            System.out.println("5. Palindrome Check");
	            System.out.println("6. Anagram Check");
	            System.out.println("7. Calendar Display");
	            System.out.println("8. Deck of Cards");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1: bmiProgram(sc); break;
	                case 2: uniqueCharactersProgram(sc); break;
	                case 3: nonRepeatingCharProgram(sc); break;
	                case 4: frequencyProgram(sc); break;
	                case 5: palindromeProgram(sc); break;
	                case 6: anagramProgram(sc); break;
	                case 7: calendarProgram(sc); break;
	                case 8: deckOfCardsProgram(sc); break;
	                case 0: System.out.println("Exiting..."); return;
	                default: System.out.println("Invalid choice!");
	            }
	        }

}}
