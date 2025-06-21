package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class maxAndMinElementInArray {
    public static void main(String[] args)
    {
        int a[]={10,400,250,150,450};

        int max=a[0];

        for (int i=0;i<a.length;i++)
        {
           if (a[i]>max) {
               max = a[i];
           }
        }
        System.out.println("Max element in array "+max);

        int b[]={250,100,35,46,2};
        int min=a[0];
        for (int i=0;i<b.length;i++)
        {
            if (b[i]<min)
            {
                min=b[i];
            }
        }
        System.out.println("Min element in array "+min);
    }
}
