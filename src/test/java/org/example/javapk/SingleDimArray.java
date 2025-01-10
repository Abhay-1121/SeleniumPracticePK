package org.example.javapk;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Arrays;

public class SingleDimArray {
    public static void main(String[] args)
    {
        //Arrays is collection elements of same data type(Homogenios data)
        //we can store multiple values into a single variable
          //approach 1
         int a[]= new int[5];
         a[0]=100;
         a[1]=200;
         a[2]=300;
         a[3]=400;
         a[4]=500;
        System.out.println(a[2]);

        //approach 2
        int a1[]={100,200,300,400,500};
        //get single value from array
        System.out.println(a[1]);
        //get length of array
        System.out.println(a1.length);
        // get all values from array
        System.out.println(Arrays.toString(a1));
        //get all values by using loop
        for (int i=0;i<a1.length;i++)
        {
            System.out.println(a[i]);
        }
        //read data from array using enhanced for loop
        for (int x:a)
        {
            System.out.println(x);
        }
    }
}
