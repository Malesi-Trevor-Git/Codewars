package com.company;

import java.util.Arrays;

public class CheckAnagram {
    public static boolean isAnagram(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        boolean  anagram=false;
        if (l1!=l2){
            anagram=false;
            Arrays.sort(c1);
            Arrays.sort(c2);
        }
        for (int i=0;i<l1;i++) {
            if (c1[i]!=c2[i]){
                anagram=false;
            }
            anagram=true;
        }
        return anagram;
    }
}
