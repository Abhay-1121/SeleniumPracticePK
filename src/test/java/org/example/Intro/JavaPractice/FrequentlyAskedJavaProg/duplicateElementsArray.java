package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.HashSet;

public class duplicateElementsArray {
    public static void main(String[] args)
    {
        String arr[]={"Java","Python","CPP","Ruby","Scala","Java"};

       //Approach-1
        boolean flag=false;
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("Duplicate element is there: "+arr[i]);
                   flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("Duplicate element is not found");
        }

        //Approach-2
        String ar1[]= {"Java","Python","CPP","Ruby","Scala","Java"};

        HashSet<String> hs=new HashSet();

        boolean flag1=false;

        for (String l:ar1)
        {
            if (hs.add(l)==false)
            {
                System.out.println("Found duplicate element "+ l);
                flag1=true;
            }

        }
        if (flag1==false)
        {
            System.out.println("Duplicate element is not found");
        }

    }
}
