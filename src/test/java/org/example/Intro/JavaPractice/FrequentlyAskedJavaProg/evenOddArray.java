package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class evenOddArray {
    public static void main(String[] args)
    {
        int a[]={2,9,7,4,6,1};

        System.out.println("Even numbers ");
      /*  for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        } */
        for (int va:a)
        {
            if (va%2==0)
            {
                System.out.println(va);
            }
        }

        System.out.println("Odd numbers ");
       /* for (int i=0;i<a.length;i++)
        {
            if (a[i]%2!=0)
            {
                System.out.println(a[i]);
            }

        }*/

        for (int va:a)
        {
            if (va%2!=0)
            {
                System.out.println(va);
            }
        }
    }
}
