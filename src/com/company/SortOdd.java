package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortOdd {
    public static int[] sortArr(int[] arr){
        int oddCount=0;
        int evenCount=0;
        int arrLen=arr.length;

        for (int a:arr){
            if (a%2==0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
        List<Integer> evenArr=new ArrayList<>();
        List<Integer> oddArr=new ArrayList<>();
        int[] resultArr=new int[arrLen];
        for (int a:arr){
            if (a%2==0){
                evenArr.add(a);
            }else{
                oddArr.add(a);
            }
        }

        return  arr;
    }
}
