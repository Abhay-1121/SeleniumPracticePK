package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();  //1234

        //1.using algorithm
		/*		int rev=0;

	while(num!=0)
		{
			rev=rev*10+num%10;  //0+1234%10=4  40+3=43  430+2=432  4320+1=4321
			num=num/10;  //1234/10=123  123/10=12  12/10=1   1/10=0
		}
		System.out.println("reverse number is"+ num);  */

        //2.using stringbuffer

        StringBuffer sb =new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("reverse number is"+ rev);

        //3. using stringbuilder

        StringBuilder sb1=new StringBuilder();
        sb1.append(num);
        StringBuilder rev1=sb1.reverse();

        System.out.println("reverse number is"+ rev1);

    }
}
