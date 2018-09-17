package com.company;
import java.util.Scanner;

public class java_06_02 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        functionLevel(scan);


    }

    private static void functionLevel(Scanner scan){
        System.out.println("Choose your Level Prayer: 1)Easy 2)Difficult");
        int chooseLevel = scan.nextInt();
        if(chooseLevel == 1){
            System.out.println("You selected EASY");
            functionLevelEasy(scan);
        }
        if(chooseLevel == 2){
            System.out.println("You selected DIFFICULT");
            functionLevelDifficult(scan);
        }
        else{
            System.out.println("wrong selection, please try again");
            functionLevel(scan);
        }


    }

    private static void functionLevelEasy(Scanner scan){
        String password = "buda";
        System.out.println("The password secret is: " + password);

        char[] passwordFirstCharacter = new char[1];
        char[] passwordLastCharacter = new char[1];
        password.getChars(0,1,passwordFirstCharacter,0);
        password.getChars(password.length()-1,password.length(),passwordLastCharacter,0);
        String passwordFirstCharacterString = String.valueOf(passwordFirstCharacter);
        String passwordLastCharacterString = String.valueOf(passwordLastCharacter);
        System.out.println("password details: \nlength: " + password.length() + "\nFirst character: " + passwordFirstCharacterString + "\nLast character: "+ passwordLastCharacterString);

        System.out.print("Intro password: ");
        String user = scan.next();
        boolean comparePassword = password.equals(user);
        if(comparePassword){
            System.out.println("you win");

        }
        else{
            boolean statusGameEnd = true;
            functionLevelEasy(scan);
        }
    }
    private static void functionLevelDifficult(Scanner scan){
        char[] password = {'d','h','a','r','m','a'};
        String passwordString = String.valueOf(password);
        int passwordInteger = password.length;
        System.out.println("The secret password is: " + passwordString);
        System.out.println("You insert");
        String user = scan.next();
        int userLength = user.length();
        if(passwordInteger != user.length()){
            System.out.println("not equal try again");
            functionLevelDifficult(scan);
        }
        if(passwordInteger == user.length()){
            for(int i=0; i<userLength;i++){
                System.out.println(i + " Password= " + password[i] + "\t" + user.charAt(i) + " =User");


        }




    }
}}