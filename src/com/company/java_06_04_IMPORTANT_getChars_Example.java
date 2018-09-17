package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class java_06_04_IMPORTANT_getChars_Example {
    public static void main(String[] args) {
        String Str1 = "Welcome to Tutorialspoint.com";
        char[] c1 = new char[7];
        Str1.getChars(2, 9, c1, 0);
        System.out.println(c1 );
    }
}




/*
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