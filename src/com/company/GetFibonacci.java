package com.company;

public class GetFibonacci {
    public static int getFibonacci(int n){
        if (n<=1){
            return 1;
        }else{
            return getFibonacci(n-1)+getFibonacci(n-2);
        }
    }
}
