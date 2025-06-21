package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;
/*
Factorial: it is a function that multiplies a number by every number below it.
    5! = 5 * 4 * 3 * 2 * 1 =120
    5! = 1 * 2 * 3 * 4 * 5 =120
 */
public class factorialNum {
    public static void main(String[] args)
    {
        int num=5;
        int factorial=1;

        for (int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }

    /*    for (int i=num;i>=1;i--)
        {
            factorial=factorial*i;
        }*/
        System.out.println("Factorial of number "+factorial);
    }
}
