package com.company;

public class ExesandOhs {
    public static boolean isEqual(String s){
        s=s.toLowerCase();
        int xCount=0,oCount=0;
        //convert to arr
        char[] arr=s.toCharArray();
        for (char c:arr){
            if (c=='x'){
                xCount++;
            }else if(c=='o'){
                oCount++;
            }
        }
        if (xCount==oCount){
            return true;
        }else{
            return false;
        }
    }
}
