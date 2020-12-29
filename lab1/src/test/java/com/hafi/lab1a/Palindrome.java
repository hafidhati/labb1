package com.hafi.lab1a;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " - " + isPalindrome(args[i]));
        }
    }
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

}
