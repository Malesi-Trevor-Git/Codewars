package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("c");
        list.add("a");
        list.add("z");
        list.add("q");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String a=it.next();
            System.out.println(a);
        }
    }
}
