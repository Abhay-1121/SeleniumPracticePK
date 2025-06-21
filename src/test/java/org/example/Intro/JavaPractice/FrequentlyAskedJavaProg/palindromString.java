package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;

public class palindromString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str= sc.next();
        String org_string=str;
        String rev="";

        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        if (org_string.equals(rev))
        {
            System.out.println("string is palindrome "+rev);
        }
        else
        {
            System.out.println("String is not palindrome "+rev);
        }


    }
}
