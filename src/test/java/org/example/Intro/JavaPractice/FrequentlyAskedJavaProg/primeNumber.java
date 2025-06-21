package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;
//prime no: a digit which is divisble by 1 and itself , its known as Prime no
public class primeNumber {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();

        int count=0;

        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if (num % i == 0) {
                    count++;
                }
            }
                if(count==2)
                {
                    System.out.println("Number is prime no");
                }
                else
                {
                    System.out.println("Number is not prime no");
                }
            }
        else
        {
            System.out.println("Number is zero or negative no");
        }
    }
}
