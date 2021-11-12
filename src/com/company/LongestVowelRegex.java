package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestVowelRegex {
    public static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static void longestVowel(String s){
        String regex="[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        System.out.println(pattern.matcher(s));
    }
}
