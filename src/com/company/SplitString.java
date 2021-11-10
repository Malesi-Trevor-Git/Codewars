package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {
    public static List<String> splitString(String s){
        String[] arr=s.split("(?<=\\G.{2})");
        List<String> l=new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (String q:arr){
            l.add(q);
        }
        return l;
    }
}
