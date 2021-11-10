package com.company;

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
        int[] oddArr=new int[oddCount];
        int[] evenArr=new int[evenCount];
        int[] resultArr=new int[arrLen];
        return  arr;
    }
}
