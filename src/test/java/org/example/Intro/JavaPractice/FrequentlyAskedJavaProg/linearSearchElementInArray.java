package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class linearSearchElementInArray {

    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};

        int search_ele=60;
        boolean flag=false;
        for (int i=0;i<a.length;i++)
        {
            if (search_ele==a[i])
            {
                System.out.println("Element found at"+i+" location");
                flag=true;
            }
        }
        if (flag==false)
        {
            System.out.println("Element not found");
        }
    }
}
