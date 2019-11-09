package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("gib wie viel stellen willst du zuverschieben ein ");
        int schlussel = eingabe.nextInt();
        System.out.println("Schreib bitte dein Text zu Verschlüsselen : ");
        String text = eingabe.next();

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int myassci = text.charAt(i);
            int sum = myassci + schlussel;
            char encodedChar = (char) sum;
            result += encodedChar;
        }
        System.out.println("das ist dein verschlüsselte Text " + result);

        String decodedStr = "";
        for (int i = 0; i < result.length(); i++) {
            int myassci = result.charAt(i);
            int sum = myassci - schlussel;
            char encodedChar = (char) sum;
            decodedStr += encodedChar;
        }
		
		

        System.out.println(decodedStr);
    }
}

