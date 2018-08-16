package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class java_05_08_IMPORTANT_Array_without_repeated_numbers {
    public static void main(String[]args){
        int[] a={2,17,3,9,3,1};
        int[] arrayMerge=sortingArray(a);
        System.out.println("Merge: " + Arrays.toString(arrayMerge));
        arrayNoRepetition(a);
    }

    private static int[] sortingArray(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;

    }
    private static void arrayNoRepetition(int[] a){
        ArrayList<Integer> b=new ArrayList<Integer>();
            for(int j=0; j<a.length-1; j++){
                if(a[j]!=a[j+1]){
                    b.add(a[j]);

                }
        }
        if(a[a.length-1] !=a[a.length-2]){
            b.add(a[a.length-1]);
            System.out.println(b);

        }

    }
}
