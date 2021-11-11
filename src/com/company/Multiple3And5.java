package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Multiple3And5 {
    public static int solution(int number) {
        List<Integer> multipleBoth = new ArrayList<>();
        List<Integer> multipleFive = new ArrayList<>();
        List<Integer> multipleThree = new ArrayList<>();
        IntStream.range(0, number).forEachOrdered(i -> {
            if (i % 3 == 0 && i % 5 == 0) {
                multipleBoth.add(i);
            } else if (i % 3 == 0) {
                multipleThree.add(i);
            } else if (i % 5 == 0) {
                multipleFive.add(i);
            }
        });
        int sum= multipleBoth.stream().mapToInt(a -> a).sum();
        sum += multipleThree.stream().mapToInt(a -> a).sum();
        sum += multipleFive.stream().mapToInt(a -> a).sum();
        return sum;
    }
}
