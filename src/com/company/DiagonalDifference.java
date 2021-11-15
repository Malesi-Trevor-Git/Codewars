package com.company;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr){
        int firstDiagonal=0,secondDiagonal=0;
        for (int i=0;i<arr.size();i++) {
            firstDiagonal+=
                    arr.get(i).get(i);
        }
        for (int i=0;i<arr.size();i++){
            secondDiagonal+=arr.get(i).get(arr.size()-(i+1));
        }
        return Math.abs(firstDiagonal-secondDiagonal);
    }
}
