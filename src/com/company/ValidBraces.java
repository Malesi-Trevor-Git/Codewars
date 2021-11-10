package com.company;

public class ValidBraces {
    public static boolean isValid(String braces) {
        if (braces.isEmpty()) {
            return true;
        } else {
            for (int i = 0; i < braces.length(); i++) {
                if ((braces.charAt(i) == '(' && braces.charAt(i + 1) == ')') ||
                        (braces.charAt(i) == '{' && braces.charAt(i + 1) == '}') ||
                        (braces.charAt(i) == '[' && braces.charAt(i + 1) == ']')) {
                    braces=braces.substring(0,i)+braces.substring(i+2);
                    isValid(braces);
                }
            }
            return false;
        }
    }
}
