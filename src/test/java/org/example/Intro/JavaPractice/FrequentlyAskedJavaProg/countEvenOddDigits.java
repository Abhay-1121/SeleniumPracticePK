package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class countEvenOddDigits {
    public static void main(String args[])
    {
            int num=1234;

            int even_count=0;
            int odd_count=0;

            while (num>0)  //1234  123  12 1
            {
                int reminder=num%10; //4  3  2
                if(reminder%2==0)
                {
                    even_count++;  //1 2
                }
                else
                {
                    odd_count++;  //1
                }
                num=num/10;  //123 12 1
            }
            System.out.println(even_count +"even digits");
            System.out.println(odd_count +"odd digits");
    }
}
