package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static String reverseLetter(final String str){
        String reversed="";
        char ch;
        String [] arr=str.split("");
        int strLen=arr.length;
        for (int i=0;i<strLen;i++) {
            ch=str.charAt(i);
            reversed+=ch;
        }
        return reversed;
    }

}
