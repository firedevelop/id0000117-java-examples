package com.company;

import java.util.ArrayList;

public class java_05_14 {
    public static void main(String[]args) {
        int[] numbersWinner = {9, 4, 5, 2, 6, 7};
        int[] numbers = {1, 3, 5, 4, 6, 8};
        ArrayList<Integer> total =new ArrayList<Integer>();
                total = functionCheckNumbers(numbersWinner, numbers);
        System.out.println(total);

    }
    private static ArrayList<Integer> functionCheckNumbers(int[] numbersWinner, int[] numbers){
        ArrayList<Integer> total=new ArrayList<Integer>();
        for(int i=0; i<6; i++) {
            if (numbersWinner[i] == numbers[i]) {
                total.add(numbersWinner[i]);
            }
        }
        return total;
    }
}