package com.hafi.lab1a;
import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        String str;// rev = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = input.nextLine();

        String pal= reverseString(str);
        System.out.println(pal);
        input.close();
    }


    public static String reverseString(String str ){
        String  rev = "";
        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            return (str+" is a palindrome");
        else
            return(str+" is not a palindrome");

    }




    public static String reverse(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }


    public static boolean isPalindrome(String word) {
        if (word.equals(reverse(word))) {
            return true;
        }
        return false;
    }
}