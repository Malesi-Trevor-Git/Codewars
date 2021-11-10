package com.company;

public class removeVowel {
    public static String diemvowel(String str) {
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String a : vowels) {
            str=str.replace(a, "");
        }
        return str;
    }
}

