package com;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class String_level2 {
	 // 1️⃣ Find length without using length()
    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // 2️⃣ Split into words manually
    public static String [] splitWordsManual(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stringLength(text); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) words.add(sb.toString());

        return words.toArray(new String[0]);
    }

    // Compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    // 3️⃣ Words with lengths in 2D array
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    // 4️⃣ Find shortest & longest word
    public static String[] shortestAndLongest(String[][] wordsData) {
        String shortest = wordsData[0][0], longest = wordsData[0][0];
        int shortestLen = Integer.parseInt(wordsData[0][1]);
        int longestLen = shortestLen;

        for (String[] row : wordsData) {
            int len = Integer.parseInt(row[1]);
            if (len < shortestLen) {
                shortest = row[0];
                shortestLen = len;
            }
            if (len > longestLen) {
                longest = row[0];
                longestLen = len;
            }
        }
        return new String[]{shortest, longest};
    }

    // 5️⃣ Check vowel/consonant
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // to lowercase
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] vowelConsonantCount(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < stringLength(text); i++) {
            String type = charType(text.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static String[][] vowelConsonantDetails(String text) {
        String[][] result = new String[stringLength(text)][2];
        for (int i = 0; i < stringLength(text); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = charType(text.charAt(i));
        }
        return result;
    }

    // 6️⃣ Trim spaces manually
    public static int[] trimIndexes(String text) {
        int start = 0, end = stringLength(text) - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    // 7️⃣ Voting eligibility
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(60) + 10; // 10–69
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // 8️⃣ Rock-Paper-Scissors
    public static String computerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return "User";
        return "Computer";
    }

    // 9️⃣ Student Marks
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3]; // PCM
        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(41) + 60; // 60–100
            marks[i][1] = rand.nextInt(41) + 60;
            marks[i][2] = rand.nextInt(41) + 60;
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3]; // total, avg, percentage
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 90) grades[i] = "A";
            else if (perc >= 75) grades[i] = "B";
            else if (perc >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void display2D(String[][] arr) {
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  String length
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Manual Length: " + stringLength(text));
        System.out.println("Built-in Length: " + text.length());

        // Split words
        String[] manualWords = splitWordsManual(text);
        String[] builtWords = text.split(" ");
        System.out.println("\nManual split: " + Arrays.toString(manualWords));
        System.out.println("Built-in split: " + Arrays.toString(builtWords));
        System.out.println("Compare: " + compareStringArrays(manualWords, builtWords));

        // Words with lengths
        String[][] wordsData = wordsWithLengths(manualWords);
        display2D(wordsData);

        //  Shortest & Longest word
        String[] sl = shortestAndLongest(wordsData);
        System.out.println("\nShortest: " + sl[0] + ", Longest: " + sl[1]);

        //  Vowels/Consonants
        int[] vc = vowelConsonantCount(text);
        System.out.println("\nVowels: " + vc[0] + ", Consonants: " + vc[1]);
        display2D(vowelConsonantDetails(text));

        // Trim
        int[] indexes = trimIndexes("   hello world   ");
        String trimmed = substringCharAt("   hello world   ", indexes[0], indexes[1]);
        System.out.println("\nManual Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + "   hello world   ".trim() + "'");

        //  Voting
        int[] ages = generateRandomAges(10);
        System.out.println("\nVoting Eligibility:");
        display2D(canVote(ages));

        //: Rock-Paper-Scissors
        System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
        String user = sc.nextLine();
        String comp = computerChoice();
        System.out.println("Computer: " + comp);
        System.out.println("Winner: " + findWinner(user, comp));

        // Student Marks
        int[][] marks = generateMarks(5);
        double[][] results = calculateResults(marks);
        String[] grades = assignGrades(results);

        System.out.println("\nStudent Scorecard:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) +
                    " PCM: " + Arrays.toString(marks[i]) +
                    " Total: " + results[i][0] +
                    " Avg: " + results[i][1] +
                    " %: " + results[i][2] +
                    " Grade: " + grades[i]);
        }
}}
