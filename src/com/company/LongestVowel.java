package com.company;

public class LongestVowel {
    public static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static int longestVowel(String str){
        int count=0,res=0;
        char[] s=str.toCharArray();
        for (int i=0;i<s.length;i++){
            if (isVowel(s[i])){
                count++;
            }else{
                res=Math.max(res,count);
                count=0;
            }
        }
        return  Math.max(res,count);
    }
}
