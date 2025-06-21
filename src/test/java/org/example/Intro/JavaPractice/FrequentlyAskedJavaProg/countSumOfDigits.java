package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;

public class countSumOfDigits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int sum=0;

        while (num>0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of digits"+ sum);
    }

    }

