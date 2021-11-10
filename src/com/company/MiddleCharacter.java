package com.company;

public class MiddleCharacter {
    public static String midChar(String word){
        int strLen=word.length();
        if (strLen%2==0){
            return word.substring((strLen/2)-1,(strLen/2)+1);
        }else if (strLen/2!=0){
            return String.valueOf(word.charAt(strLen/2));
        }
        else{
            return word;
        }
    }
}
