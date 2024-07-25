package org.example;

import java.util.Scanner;
/*
    Darle reversa a una cadena
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(reverseString(word));
    }

    public static String reverseString(String word){
        String reversedString = "";
        for(int i = word.length(); i > 0 ; i--){
            reversedString += "" + word.charAt( i - 1 );
        }
        return reversedString;
    }
}