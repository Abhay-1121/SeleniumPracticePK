package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.ArrayList;

public class uniqueNoFromArray {
    public static void main(String[] args) {

        int a[]={4,6,6,5,6,5,4,6,7};

        ArrayList<Integer> as=new ArrayList<Integer>();

        for (int i=0;i<a.length;i++)
        {
            if(!as.contains(a[i]))
            {
                int k=0;
                as.add(a[i]);
                k++;

                for (int j=i+1;j<a.length;j++)
                {
                    if (a[i]==a[j])
                    {
                        k++;
                    }
                }
                System.out.println("no from array"+ a[i]);
                System.out.println(a[i]+"is repeated" + k+ "times");
            }
        }

    }
}
