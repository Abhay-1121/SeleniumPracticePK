package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Arrays;
import java.util.Collections;

public class sortEleBuiltinMethods {

    public static void main(String[] args)
    {
        //Approach-1
        /*int a[]={40,50,10,20,60,15};

        System.out.println("Before sorting "+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Before sorting "+ Arrays.toString(a));*/

        //Approach-2
        /*int a[]={40,50,10,20,60,15};

        System.out.println("Before sorting "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Before sorting "+ Arrays.toString(a));*/;

        //Approach-3 : reverse descending order
        Integer a[]={40,50,10,20,60,15};

        System.out.println("Before sorting "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Before sorting "+ Arrays.toString(a));

    }
}
