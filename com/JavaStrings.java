package com;
import java.util.*;
public class JavaStrings {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- String Problems Menu ---");
	            System.out.println("1. Count Vowels and Consonants");
	            System.out.println("2. Reverse a String");
	            System.out.println("3. Palindrome String Check");
	            System.out.println("4. Remove Duplicates from a String");
	            System.out.println("5. Find the Longest Word in a Sentence");
	            System.out.println("6. Find Substring Occurrences");
	            System.out.println("7. Toggle Case of Characters");
	            System.out.println("8. Compare Two Strings Lexicographically");
	            System.out.println("9. Find the Most Frequent Character");
	            System.out.println("10. Remove a Specific Character from a String");
	            System.out.println("11. Anagram Check");
	            System.out.println("12. Replace a Word in a Sentence");
	            System.out.println("0. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine().toLowerCase();
	                    int vowels = 0, consonants = 0;
	                    for (char c : str.toCharArray()) {
	                        if (Character.isLetter(c)) {
	                            if ("aeiou".indexOf(c) != -1) vowels++;
	                            else consonants++;
	                        }
	                    }
	                    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	                }
	                case 2 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine();
	                    String rev = "";
	                    for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
	                    System.out.println("Reversed String: " + rev);
	                }
	                case 3 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine();
	                    String rev = "";
	                    for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
	                    System.out.println(str.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome");
	                }
	                case 4 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine(), result = "";
	                    for (int i = 0; i < str.length(); i++) {
	                        if (result.indexOf(str.charAt(i)) == -1) result += str.charAt(i);
	                    }
	                    System.out.println("Modified String: " + result);
	                }
	                case 5 -> {
	                    System.out.print("Enter a sentence: ");
	                    String[] words = sc.nextLine().split(" ");
	                    String longest = "";
	                    for (String word : words) if (word.length() > longest.length()) longest = word;
	                    System.out.println("Longest Word: " + longest);
	                }
	                case 6 -> {
	                    System.out.print("Enter main string: ");
	                    String str = sc.nextLine();
	                    System.out.print("Enter substring: ");
	                    String sub = sc.nextLine();
	                    int count = 0, index = 0;
	                    while ((index = str.indexOf(sub, index)) != -1) {
	                        count++;
	                        index += sub.length();
	                    }
	                    System.out.println("Occurrences: " + count);
	                }
	                case 7 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine(), result = "";
	                    for (char c : str.toCharArray()) {
	                        if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
	                        else if (Character.isLowerCase(c)) result += Character.toUpperCase(c);
	                        else result += c;
	                    }
	                    System.out.println("Toggled String: " + result);
	                }
	                case 8 -> {
	                    System.out.print("Enter first string: ");
	                    String s1 = sc.nextLine();
	                    System.out.print("Enter second string: ");
	                    String s2 = sc.nextLine();
	                    int len = Math.min(s1.length(), s2.length()), cmp = 0;
	                    for (int i = 0; i < len; i++) {
	                        if (s1.charAt(i) != s2.charAt(i)) {
	                            cmp = s1.charAt(i) - s2.charAt(i);
	                            break;
	                        }
	                    }
	                    if (cmp == 0) cmp = s1.length() - s2.length();
	                    if (cmp < 0) System.out.println(s1 + " comes before " + s2);
	                    else if (cmp > 0) System.out.println(s2 + " comes before " + s1);
	                    else System.out.println("Both strings are equal");
	                }
	                case 9 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine();
	                    int[] freq = new int[256];
	                    for (char c : str.toCharArray()) freq[c]++;
	                    int max = 0; char res = ' ';
	                    for (char c : str.toCharArray()) {
	                        if (freq[c] > max) { max = freq[c]; res = c; }
	                    }
	                    System.out.println("Most Frequent Character: '" + res + "'");
	                }
	                case 10 -> {
	                    System.out.print("Enter a string: ");
	                    String str = sc.nextLine();
	                    System.out.print("Enter character to remove: ");
	                    char ch = sc.next().charAt(0);
	                    String result = "";
	                    for (char c : str.toCharArray()) if (c != ch) result += c;
	                    System.out.println("Modified String: " + result);
	                    sc.nextLine(); // consume leftover newline
	                }
	                case 11 -> {
	                    System.out.print("Enter first string: ");
	                    String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
	                    System.out.print("Enter second string: ");
	                    String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
	                    if (s1.length() != s2.length()) {
	                        System.out.println("Not Anagrams");
	                        break;
	                    }
	                    char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
	                    Arrays.sort(a1); Arrays.sort(a2);
	                    System.out.println(Arrays.equals(a1, a2) ? "Anagrams" : "Not Anagrams");
	                }
	                case 12 -> {
	                    System.out.print("Enter a sentence: ");
	                    String sentence = sc.nextLine();
	                    System.out.print("Word to replace: ");
	                    String oldWord = sc.next();
	                    System.out.print("New word: ");
	                    String newWord = sc.next();
	                    String result = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
	                    System.out.println("Modified Sentence: " + result);
	                    sc.nextLine(); // consume newline
	                }

}}}}
