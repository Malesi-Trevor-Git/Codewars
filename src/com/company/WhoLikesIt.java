package com.company;

public class WhoLikesIt {
    public static String whoLikesIt(String... names){
        int strLen= names.length;
        if (strLen ==0){
            return "no one likes this";
        }else if(strLen>=1){
            if (strLen==1){
                for (String s:names){
                    return s+" likes this";
                }
            }
            if (strLen==2){
                for (int i=0;i<names.length;i++) {
                    return names[0]+" and "+ names[1]+" likes this";
                }
            }
            if (strLen==3){
                for (int i=0;i<names.length;i++){
                    return names[0]+", "+names[1]+" and "+names[2]+" likes this";
                }
            }
            if (strLen>3){
                int extraNames=names.length-2;
                return names[0]+", "+names[1]+" and "+extraNames+" others like this";

            }
        }

        return " ";
    }
}
