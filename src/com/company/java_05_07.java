package com.company;

import java.util.Arrays;

public class java_05_07 {
    public static void main(String[]args){
        int[] array1={5,1,10,1,6,17};
        int[] array2={3,15,7,11,3,4};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] array3=mergeArrays(array1,array2);
        System.out.println(Arrays.toString(array3)); // [1, 5, 5, 6, 10, 17, 3, 3, 4, 7, 11, 15]
        //int[] array4=sortArray(array3);


    }
    static int[] mergeArrays(int[]array1, int[]array2){
        int[] array3=new int[12];
        int j=0;
        for(int i=0; i<array3.length; i++){
            if(i<=5){

                array3[i]=array1[i];}
            if(i>=6){
                array3[i]=array2[j];
                j++;}
        }
        return array3;
    }
}
