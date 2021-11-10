package com.company;

import java.util.LinkedHashSet;

public class PalindromeString {
    public static void isPalindrome(String str1){
        char c;
        String reversed="";
        for (int i=0;i<str1.length();i++){
            c=str1.charAt(i);
            reversed=c+reversed;
        }
        if (reversed.equals(str1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}