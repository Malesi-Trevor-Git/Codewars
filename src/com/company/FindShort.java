package com.company;

import java.util.stream.Stream;

public class FindShort {
    public static  int getShort(String s){
        int minValue=Integer.MAX_VALUE;
        for (String a:s.split(" ")){
            if (a.length()<minValue){
                minValue=a.length();
            }
        }
        return minValue;
    }
}
