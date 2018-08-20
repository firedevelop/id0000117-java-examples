package com.company;

import java.util.ArrayList;

public class java_05_09_IMPORTANT_Bidimensional_Array {
    public static void main(String[]args) {

        int[][] student = {
                {4, 5, 6},
                {7, 7, 4},
                {1, 3, 1},
                {5, 5, 9},
                {4, 10, 6},
        };

        System.out.println("--------- ALL STUDENT GRADES ---------");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + " grade:");
            for (int j = 0; j < 3; j++)
                System.out.println(student[i][j]);
        }
        int sum1=1;
        int sum2=2;
        int sum3=3;
        int count=1;
        for(int j=0; j<3;j++){
        System.out.println("--------- " + (j+1) + " TRIMESTER ---------");
         for(int i=0; i<5;i++) {
            System.out.println("Student " + (i+1) + " = " + student[i][j]);
            if(count==1) {
                int trimester1=student[i][0];
                sum1 += trimester1;
            }
             if(count==2) {
                 int trimester2=student[i][1];
                 sum2 += trimester2;
             }
             if(count==3) {
                 int trimester3=student[i][2];
                 sum3 += trimester3;
             }
         }count++;
    }
        System.out.println("\n--------- TRIMESTER AVERAGE GRADE ---------");
        System.out.println("Average grade" + sum1/3);
        System.out.println("Average grade" + sum2/3);
        System.out.println("Average grade" + sum3/3);
  }
}
