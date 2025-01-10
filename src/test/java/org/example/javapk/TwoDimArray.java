package org.example.javapk;

public class TwoDimArray {

    public static void main(String[] args)
    {
        //approach 1
        /*
        int a[][]=new int[3][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600; */

        //approach 2
        int a[][]= {{100,200},{300,400},{500,600}};
        //length of array
        System.out.println(a.length);
        System.out.println(a[0].length);
        //read specific value
        System.out.println(a[2][0]);
        //read value from array using for loop
        for (int r=0;r<a.length;r++)
        {
            for (int c=0;c<a[r].length;c++)
            {
                System.out.print(a[r][c]);
            }
            System.out.println();
        }

        //reading data from 2d array using enhanced for loop
        for (int x[]:a)
        {
            for (int v:x)
            {
                System.out.print(v);
            }
        }


    }
}
