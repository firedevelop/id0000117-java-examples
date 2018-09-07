package com.company;

import java.util.ArrayList;

public class java_05_10 {
    public static void main(String[]args){
        int arraySize=5;
        ArrayList<Integer> numEven = new ArrayList<Integer>();
        ArrayList<Integer> numOdd = new ArrayList<Integer>();
        ArrayList<Integer> num = new ArrayList<Integer>(arraySize);
        num.add(10);
        num.add(3);
        num.add(2);
        num.add(1);
        num.add(8);

        int arrayNum;
        for(int i=0; i<arraySize;i++){
            arrayNum=num.get(i);
            if((arrayNum%2)==0){
                //System.out.println(num.get(i) + " es par");
                numEven.add(arrayNum);
            }
            else{
                //System.out.println(num.get(i) + " es impar");
                numOdd.add(arrayNum);
            }
        }
        System.out.println("Array Evens: " + numEven);
        System.out.println("Array Odd " + numOdd);


    }
}
