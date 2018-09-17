package com.company;

public class java_06_01_IMPORTANT_forDigit {
    public static void main(String[]args){
        for(int i=0; i<20; i++) {
            int num = Character.forDigit(i, 16);
            char chr = Character.forDigit(i, 16);
            int numValue = Character.getNumericValue(chr);
            System.out.println("RADIX 16 - Numeric Value " + numValue + " = Char = " + chr + "\tInteger = " + num);
        }
        System.out.println("\n\n");
        for(int i=0; i<20; i++) {
            int num = Character.forDigit(i, 10);
            char chr = Character.forDigit(i, 10);
            int numValue = Character.getNumericValue(chr);
            System.out.println("RADIX 10 - Numeric Value " + numValue + " = Char = " + chr + "\tInteger = " + num);
        }

    }
}