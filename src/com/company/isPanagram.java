package com.company;


public class isPanagram {
    public static boolean checkPanagram(String sentence){
        sentence=sentence.toLowerCase();
        boolean allPanagram=true;
        for (char c='a';c<='z';c++){
            if (!sentence.contains(String.valueOf(c))){
                allPanagram=false;
                break;
            }
        }
        if (allPanagram){
            return true;
        }else{
            return false;
        }
    }
}