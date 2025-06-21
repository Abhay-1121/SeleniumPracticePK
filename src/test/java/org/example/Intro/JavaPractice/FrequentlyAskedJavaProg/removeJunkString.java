package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class removeJunkString {
    public static void main(String[] args)
    {
        String s="%^$&** !@%*& Java Selenium";

        System.out.println(s.replaceAll("[^a-zA-z0-9]",""));
    }
}
