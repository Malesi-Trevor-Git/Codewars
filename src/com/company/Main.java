package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        System.out.println(Main.getHigher(21));
    }
    public static int getHigher(int n){
        int next=n+100;
        int result=0;
        for (int i=n;i<=n+100000;i++){
            if (i%5==0){
                result=i;
                break;
            }
        }
        return result;
    }
}
