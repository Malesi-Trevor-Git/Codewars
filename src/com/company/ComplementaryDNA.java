package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        //convert to char array
        char[] array = dna.toCharArray();
        for (int i=0;i< array.length;i++ ){
            array[i]=getComplement(array[i]);
        }
        return String.valueOf(array);
    }
    public static char getComplement(char c){
        switch (c){
            case 'A':return 'T';
            case 'T':return 'A';
            case 'C':return 'G';
            case 'G':return 'C';
        }
        return c;
    }
}
