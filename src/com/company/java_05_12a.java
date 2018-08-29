package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class java_05_12a {
    public static void main(String[] args){
        int[][]matrix = new int[5][5];
        for(int n=0; n<matrix.length;n++){
            for(int m=0; m<matrix.length; m++){
                matrix[n][m]=n+m;
            }}System.out.println("\n" + Arrays.deepToString(matrix));
    }


}
