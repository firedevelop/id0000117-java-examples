package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class java_05_11 {
    public static void main(String[]args){
        final int size=4;
        int[][] matrix = functionArrayRandom(size);
        System.out.println(Arrays.deepToString(matrix));
        int [][] check = functionCheckArrayMagic(matrix);
    }

        private static int[][] functionArrayRandom(int size){
        int[][] matrix=new int[size][size];
        for(int i=0; i<size;i++) {
            for (int j = 0; j < size; j++) {
                int num = ThreadLocalRandom.current().nextInt(1,10);
                //int num = 2;
                matrix[i][j] = num;
                System.out.print(matrix[i][j]+ " ");

            }
            System.out.println();

            }
        return matrix;}

        private static int[][] functionCheckArrayMagic(int[][]matrix){


        return matrix;
    }

}
