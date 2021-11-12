package com.company;

import java.util.List;

public class AVeryBigSum {
    public static long averyBigSum(List<Long> arr){
        long sum=0;
        for (Long a:arr){
            sum += a;
        }
        return sum;
    }
}
