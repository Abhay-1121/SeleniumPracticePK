package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class missingNoInArray {

    public static void main(String[] args)
    {
        /* Array should not contains duplicate
        * Array no need to be in sorted order
        * Values should be in range
        * */

        int a[]={1,2,4,5};

        /*1+2+4+5=12 sum1
        *1+2+3+4+5=15 sum2
        * Sum2-Sum1=15-13=3 missing
        * */

        int sum1=0;

        for (int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }

        int sum2=0;

        for (int i=1;i<=5;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("Sum of range of elements in array "+sum2);
        System.out.println("Sum of range of elements in array "+(sum2-sum1));

    }
}
