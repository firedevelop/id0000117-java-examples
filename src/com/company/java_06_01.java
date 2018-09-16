package com.company;

import java.util.Scanner;

public class java_06_01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Intro word1: ");
        String s1 = sc1.next();
        System.out.println(s1);
        System.out.print("intro word2: ");
        String s2 = sc1.next();
        System.out.println(s2);
        System.out.println("s1.length = " + s1.length());
        if (s1.length() > s2.length()) {
            System.out.println("The low number is: " + s2);
        }
        if (s1.length() < s2.length()) {
            System.out.println("The low number is:" + s1);
        } else {
            System.out.println("the numbers are equals");

        }
    }
}




/*
        ArrayList<Integer> b=new ArrayList<Integer>();

        String Str1 = new String("Welcome to Tutorialspoint.com");
        String[] Str2 = new String[7];
            Str1.getChars(2, 9, Str2, 0);
            System.out.println(Str2 );

isDigit
isLetter
isLetterOrDigit
isLowerCase
isUpperCase
isSpaceChar
isWhiteSpace
toLowerCase
toUpperCase
toString

valueOf
equals
equalsIgnoreCase
regionMatches
compareTo
charAt
substring
trim
length
indexOf
lastIndexOf
isEmpty
startsWith
endsWith
replace

toIgnoreCase
concat
contains
toCharArray
valueOf(char, 0,3)
getChars
forDigit
  */