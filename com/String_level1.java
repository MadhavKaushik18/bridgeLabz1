package com;
import java.util.Scanner;
public class String_level1 {
	   // 1️⃣ Compare two strings using charAt()
    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // 2️⃣ Create substring using charAt()
    public static String substringCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // 3️⃣ Convert String to char array manually
    public static char[] toCharArrayManual(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // 4️⃣ NullPointerException demo
    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length()); // will throw NullPointerException
    }

    public static void handleNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    // 5️⃣ StringIndexOutOfBoundsException demo
    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // 6️⃣ IllegalArgumentException demo
    public static void generateIllegalArgument(String text) {
        System.out.println(text.substring(5, 2)); // invalid args
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }

    // 7️⃣ NumberFormatException demo
    public static void generateNumberFormat(String text) {
        int num = Integer.parseInt(text); // invalid number
        System.out.println(num);
    }

    public static void handleNumberFormat(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        }
    }

    // 8ArrayIndexOutOfBoundsException demo
    public static void generateArrayIndexOutOfBounds(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    public static void handleArrayIndexOutOfBounds(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // 9️⃣ Convert to uppercase manually
    public static String toUpperCaseManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 🔟 Convert to lowercase manually
    public static String toLowerCaseManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Compare Strings
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        System.out.println("CharAt Compare: " + compareStringsCharAt(s1, s2));
        System.out.println("equals() Compare: " + s1.equals(s2));

        // Substring
        System.out.print("\nEnter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String sub1 = substringCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("Substring (manual): " + sub1);
        System.out.println("Substring (built-in): " + sub2);
        System.out.println("Compare: " + compareStringsCharAt(sub1, sub2));

        //Char array conversion
        char[] manualArr = toCharArrayManual(text);
        char[] builtArr = text.toCharArray();
        System.out.println("\nChar array compare: " + compareCharArrays(manualArr, builtArr));

        //NullPointerException
        try {
            generateNullPointer();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
        handleNullPointer();

        //StringIndexOutOfBounds
        try {
            generateStringIndexOutOfBounds(text);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
        handleStringIndexOutOfBounds(text);

        //IllegalArgumentException
        try {
            generateIllegalArgument(text);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
        handleIllegalArgument(text);

        // NumberFormatException
        try {
            generateNumberFormat("abc123");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
        handleNumberFormat("abc123");

        // ArrayIndexOutOfBoundsException
        String[] names = {"A", "B", "C"};
        try {
            generateArrayIndexOutOfBounds(names);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
        handleArrayIndexOutOfBounds(names);

        //  Uppercase Conversion
        sc.nextLine(); // clear buffer
        System.out.print("\nEnter text for uppercase conversion: ");
        String upText = sc.nextLine();
        String manualUpper = toUpperCaseManual(upText);
        String builtUpper = upText.toUpperCase();
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtUpper);
        System.out.println("Compare: " + compareStringsCharAt(manualUpper, builtUpper));

        //  Lowercase Conversion
        System.out.print("\nEnter text for lowercase conversion: ");
        String lowText = sc.nextLine();
        String manualLower = toLowerCaseManual(lowText);
        String builtLower = lowText.toLowerCase();
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtLower);
        System.out.println("Compare: " + compareStringsCharAt(manualLower, builtLower));



}}
