package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class sumOfArray {
    public static void main(String[] args)
    {
        int a[]={4,5,2,6,7};
        int sum=0;

      for (int i=0;i<= a.length-1;i++)
        {
            sum=sum+a[i];
        }

    /*    //Enhanced for loop
        for (int value:a)
        {
            sum=sum+value;
        } */
        System.out.println("Sum of array "+ sum);
    }
}
