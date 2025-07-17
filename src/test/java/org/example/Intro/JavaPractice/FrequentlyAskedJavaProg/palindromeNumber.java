package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;
//palindrome: a number when we are arranging reverse then also it will be same only.
public class palindromeNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int org_num= num;
        int rev=0;

        while(num!=0)
        {
            rev=rev*10+ num%10;
            num=num/10;
        }

        if(org_num==rev)
        {
            System.out.println("number is palindrome "+ org_num);
        }
        else
        {
            System.out.println("number is not palindrome "+ org_num);
        }
    }

}
