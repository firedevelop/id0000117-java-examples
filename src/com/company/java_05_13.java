package com.company;

import java.util.Arrays;

public class java_05_13 {
        public static void main(String[]args){
        int[] matrix ={3, 15, 2, 6, 1};
            System.out.println(Arrays.toString(matrix));
            int total = functionMaxValue(matrix);
            System.out.println("The max value is: " + total);

        }

        private static int functionMaxValue(int[] matrix){
            Arrays.sort(matrix);
            int maxMatrix = matrix[matrix.length-1];

            return maxMatrix;
    }
    }