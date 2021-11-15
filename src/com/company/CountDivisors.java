package com.company;

public class CountDivisors {
    public static long numberOfDivisors(int n){
        long number=0;
        for (int i=1;i<=5000000;i++){
            if (n%i==0) {
                number++;
            }
        }
        return number;
    }
}
