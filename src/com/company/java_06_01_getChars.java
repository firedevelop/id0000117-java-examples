package com.company;
public class java_06_01_getChars {
    public static void main(String[]args){
        String s1 = "buda";
        char[] c1 ={'a','b','c'};
        s1.getChars(0,2,c1,0);
        System.out.println(c1);
    }
}