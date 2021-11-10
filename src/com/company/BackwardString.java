package com.company;

public class BackwardString {
    public static void reverseString(String s,int strLen){
        if (strLen>0){
            System.out.print(s.charAt(strLen-1));
            reverseString(s,strLen-1);
        }
    }
}
