package com.company;

public class StrayNumber {
    static int stray(int[] numbers){
        int arrLen=numbers.length;
        int res=numbers[0];
        for (int i=1;i<arrLen;i++) {
            res=res^numbers[i];
        }
        return res;
    }
}
