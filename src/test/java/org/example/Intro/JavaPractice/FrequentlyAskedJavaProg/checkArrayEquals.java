package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Arrays;

public class checkArrayEquals {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};

      /*  //Approach 1-

        boolean status= Arrays.equals(a,b);
        if (status==true)
        {
            System.out.println("Array is equal");
        }
        else
        {
            System.out.println("Array is not equal");
        } */
        //Approach 2-

        boolean status=true;
        if (a.length== b.length)
        {
           for (int i=0;i<a.length;i++)
           {
               if(a[i]!=b[i])
               {
                   status=false;
               }
           }
        }
        else
        {
            status=false;
        }
        if (status==true)
        {
            System.out.println("Array is equal");
        }
        else
        {
            System.out.println("Array is not equal");
        }
    }
}
