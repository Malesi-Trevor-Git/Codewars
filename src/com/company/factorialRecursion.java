package com.company;

public class factorialRecursion {
    //base case n=0;
    //recursive case n*fact(n-1);
    public static int fact(int n){
        if (n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
