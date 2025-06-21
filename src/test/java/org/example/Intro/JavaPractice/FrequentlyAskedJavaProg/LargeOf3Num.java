package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;

public class LargeOf3Num {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstnum= sc.nextInt();

        System.out.println("Enter your second number");
        int secondnum= sc.nextInt();

        System.out.println("Enter your third number");
        int thirdnum= sc.nextInt();

        //Approach-1: Logic

     /*   if(firstnum>secondnum &&  firstnum>thirdnum)
        {
            System.out.println("First num is largest"+firstnum);
        } else if (secondnum>firstnum && secondnum>thirdnum)
        {
            System.out.println("Second num is largest"+secondnum);
        }
        else
        {
            System.out.println("third num is largest"+thirdnum);
        }*/

        //Approach-2: Logic-Ternery operator
        int largest=firstnum>secondnum?firstnum:secondnum;
        int largest1=thirdnum>largest?thirdnum:largest;

        System.out.println("Second num is largest"+largest1);

    }
}
