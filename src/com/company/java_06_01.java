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
            System.out.println("The low word is: " + s2);
        }
        if (s1.length() < s2.length()) {
            System.out.println("The low word is:" + s1);
        } else {
            System.out.println("the words are equals");

        }
    }
}