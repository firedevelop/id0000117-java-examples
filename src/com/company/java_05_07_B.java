package com.company;

import java.util.Arrays;

public class java_05_07_B {
    public static void main(String[]args){
        int[] a = {2,7,6,1,3,2};
       int[] total1=sortArray(a);
        System.out.println(Arrays.toString(total1));
    }
    private static int[] sortArray(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    private static int[] deleteRepeated(int[] a){



        return a;
    }
}
