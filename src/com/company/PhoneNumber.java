package com.company;

import java.util.Arrays;

public class PhoneNumber {
    public static void createPhoneNumber(int[] numbers){
        String[] str= Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

    }
}
