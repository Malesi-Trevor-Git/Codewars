package com.company;

public class DigitalRoot {
    public static int digRoot(int num){
        int root=0;
        while (num>0 || root>9){
            if (num==0){
                num=root;
                root=0;
            }
            root+=num%10;
            num/=10;
        }
        return root;
    }
}
