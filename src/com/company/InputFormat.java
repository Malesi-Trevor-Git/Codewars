package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFormat {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        int Q=sc.nextInt();

        sc.close();
    }
}
