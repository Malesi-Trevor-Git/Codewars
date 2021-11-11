package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDifference {
    public static int[] arrayDiff(int[] a, int[] b){
        HashSet<Integer> result = new HashSet<>();
        Arrays.sort(b);
        for (int element:b){
            if (Arrays.binarySearch(b,element)<0){
                result.add(element);
            }
        }
        int[] arr=new int[result.size()];
        int i=0;
        for (int element:result){
            arr[i++]=element;
        }
        return arr;
    }

}
