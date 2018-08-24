package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class java_05_11 {
    public static void main(String[] args) {
        final int size = 4;
        //int[][] matrix = functionArrayRandom(size);   //Matrix filled by Random
        int[][] matrix = functionCheckArrayMagic(size); //Matrix filled manually
        int[][] matrixChecked = functionCheckIfMatrixMagic(matrix, size);
        System.out.println("\nmatrix: " + Arrays.deepToString(matrix));
        System.out.println("matrixCheked: " + Arrays.deepToString(matrixChecked));

    }

    private static int[][] functionArrayRandom(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num = ThreadLocalRandom.current().nextInt(1, 10); // 1. comment for testing
                matrix[i][j] = num;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    private static int[][] functionCheckArrayMagic(int size) {
        int[][] matrix = new int[size][size];
        int num = 0;
        matrix[0][0] = 1;
        matrix[0][1] = 15;
        matrix[0][2] = 14;
        matrix[0][3] = 4;
        matrix[1][0] = 10;
        matrix[1][1] = 11;
        matrix[1][2] = 8;
        matrix[1][3] = 5;
        matrix[2][0] = 7;
        matrix[2][1] = 6;
        matrix[2][2] = 9;
        matrix[2][3] = 12;
        matrix[3][0] = 16;
        matrix[3][1] = 2;
        matrix[3][2] = 3;
        matrix[3][3] = 13;

        return matrix;
    }

    private static int[][] functionCheckIfMatrixMagic(int[][] matrixChecked, int size) {

        int totalArrayRow0 = 0;
        int totalArrayRow1 = 0;
        int totalArrayRow2 = 0;
        int totalArrayRow3 = 0;
        int totalArrayColumn0 = 0;
        int totalArrayColumn1 = 0;
        int totalArrayColumn2 = 0;
        int totalArrayColumn3 = 0;

        for (int i = 0; i < size; i++) {

            int count = i;
            System.out.println("\n");
            for (int j = 0; j < size; j++) {
                System.out.print(matrixChecked[i][j] + " ");

                if (i == count) {
                    int matrixIndex = matrixChecked[i][j];

                    if (i == 0) {
                        totalArrayRow0 += matrixIndex;
                    }
                    if (i == 1) {
                        totalArrayRow1 += matrixIndex;
                    }
                    if (i == 2) {
                        totalArrayRow2 += matrixIndex;
                    }
                    if (i == 3) {
                        totalArrayRow3 += matrixIndex;
                    }
                }
                if (i == count) {
                    int matrixIndexColumn = matrixChecked[i][j];


                    if (j == 0) {
                        totalArrayColumn0 += matrixIndexColumn;
                    }
                    if (j == 1) {
                        totalArrayColumn1 += matrixIndexColumn;
                    }
                    if (j == 2) {
                        totalArrayColumn2 += matrixIndexColumn;
                    }
                    if (j == 3) {
                        totalArrayColumn3 += matrixIndexColumn;
                    }
                }

            }


        }
        System.out.println("\n\nRow 0: " + totalArrayRow0);
        System.out.println("Row 1: " + totalArrayRow1);
        System.out.println("Row 2: " + totalArrayRow2);
        System.out.println("Row 3: " + totalArrayRow3);
        System.out.println("\n\nColumn 0: " + totalArrayColumn0);
        System.out.println("Column 1: " + totalArrayColumn1);
        System.out.println("Column 2: " + totalArrayColumn2);
        System.out.println("Column 3: " + totalArrayColumn3);

                            if(totalArrayRow0 == totalArrayRow0 &&
                              totalArrayRow0 == totalArrayRow1 &&
                              totalArrayRow0 == totalArrayRow2 &&
                              totalArrayRow0 == totalArrayRow3 &&
                                totalArrayRow0 == totalArrayColumn0 &&
                                totalArrayRow0 == totalArrayColumn1 &&
                                totalArrayRow0 == totalArrayColumn2 &&
                                totalArrayRow0 == totalArrayColumn3){
            System.out.println("THE ARRAY IS MAGI2!");

        }else
        {
            System.out.println("THE ARRAY IS NOT MAGIC :(");
        }


        return matrixChecked;
    }
}
