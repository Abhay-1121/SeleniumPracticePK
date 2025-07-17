package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;
//Fibonacci series refers to a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
//0 1 1 2 3 5 8 13 21 34
public class fibonacciSeries {
    public static void main(String[] args)
    {
        int num1=0; int num2=1; int sum=0;

       // System.out.println(num1+" "+num2);
        for(int i=2;i<10;i++)
        {
            sum=num1+num2; // 01 11 12 23
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
        }

    }
}
