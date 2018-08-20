package com.company;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class java_05_03_IMPORTANT {
    public static void main(String[]args){
        int arraySize;
        int sumPositive=0;
        int sumNegative=0;
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        //System.out.println("Array Size:");
        //arraySize = scan.nextInt();
        arraySize = 4;
        int[] numbers = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            //System.out.println("Intro num "+ i + ": ");
            //numbers[i]=scan.nextInt();
            Random random = new Random();
            int randomNumber = (random.nextInt(20)-10);
            numbers[i]=randomNumber;
            System.out.println(numbers[i]);
            if(numbers[i]>0){
                sumPositive += numbers[i];
                countPositive++;
            }
            if(numbers[i]<0){
                sumNegative += numbers[i];
                countNegative++;
            }
            if(numbers[i]==0){
                countZero++;
            }

        }
        System.out.println("sumPositive: " + sumPositive);
        System.out.println("sumNegative: " + sumNegative);

        if(countPositive != 0){
            System.out.println("avgPositive: " + sumPositive/countPositive);}
        if(countNegative !=0){
            System.out.println("avgNegative: " + sumNegative/countNegative);}

        System.out.println("countZero: " + countZero);


    }
}