package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Arrays;
//this example of bubble sort algorithm
public class bubbleSort {
    public static void main(String[] args)
    {
        int a[]={10,50,70,30,60,20};
        System.out.println("Arays before sorting "+ Arrays.toString(a));
        int n=a.length;
        for (int i=0;i<n-1;i++)  //number of passes
        {
            for (int j=0;j<n-1;j++) //no of iteration
            {
                if (a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Arays after sorting "+ Arrays.toString(a));
    }
}
