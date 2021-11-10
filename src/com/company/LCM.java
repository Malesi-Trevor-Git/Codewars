package com.company;

public class LCM {
    public static int lcm(int[] arr){
        int lcm=1;
        int divisor=2;
        while (true){
            int count=0;
            boolean divisible=false;
            for (int i=0;i<arr.length;i++) {
                if (arr[i]<0){
                    return 0;
                }
                if (arr[i]==1){
                    count++;
                }
                if (arr[i]%divisor==0){
                    divisible=true;
                    arr[i]=arr[i]/divisor;
                }
            }
            if (divisible) {
                lcm = lcm * divisor;
            }else{
                divisor++;
            }
            if (count==arr.length){
                return  lcm;
            }
        }
    }
}
