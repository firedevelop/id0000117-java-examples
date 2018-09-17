package com.company;

public class java_06_01_IMPORTANT_forDigit {
    public static void main(String[]args){
        for(int i=0; i<20; i++) {
            int num = Character.forDigit(i, 16);
            char text = Character.forDigit(i, 16);
            int numValue = Character.getNumericValue(text);
            System.out.println("RADIX 16 - Numeric Value " + numValue + " = Hexadecimal = " + text + "\tDecimal = " + num);
        }
        System.out.println("\n\n");
        for(int i=0; i<20; i++) {
            int num = Character.forDigit(i, 10);
            char text = Character.forDigit(i, 10);
            int numValue = Character.getNumericValue(text);
            System.out.println("RADIX 10 - Numeric Value " + numValue + " = Hexadecimal = " + text + "\tDecimal = " + num);
        }

    }
}