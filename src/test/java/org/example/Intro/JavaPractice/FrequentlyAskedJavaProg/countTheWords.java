package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;

public class countTheWords {
    public static void main(String[] args)
    {
        System.out.println("Enter your string: ");
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        System.out.println("String length: "+s.length());
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in string "+count);
    }
}
