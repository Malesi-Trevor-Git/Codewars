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
    public static int optimizedDigRoot(int n){
        return (n!=0&&n%9==0?9:n%9);
    }
}
