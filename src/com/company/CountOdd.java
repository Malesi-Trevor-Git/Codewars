package com.company;

public class CountOdd {
    public static int oddCount(int n ){
        int lowest=0;
        for (int i=0;i<n;i++){
            if (!(i%2==0)){
                lowest++;
            }
        }
        return lowest;
    }
}
