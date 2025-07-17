package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class countDigitsnLetters {

    public static void main(String[] args) {

        String input = "a1b2c3";

        String letters = "";
        String digits = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                digits =digits+ ch;
            } else if (Character.isLetter(ch)) {
                letters =letters+ ch;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}
