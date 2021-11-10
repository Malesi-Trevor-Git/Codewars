package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingLetter {
    public static void findMissingLetter(char[] array){
        //find starting and end
        char start=' ';
        for (int i=0;i<array.length;i++){
            if (i==0){
                start=array[i];
            }
        }
        char end=array[array.length-1];
        List<Character> list;
        list = new ArrayList<>();
        for (char c=start;c<=end;c++){
            list.add(c);
        }
        for (int i=0;i<list.size();i++){
            for (int j=0;j<array.length;j++) {
                if (!(list.get(i) ==array[j])){
                    System.out.println(array[j]);
                }
            }
        }

    }
}
