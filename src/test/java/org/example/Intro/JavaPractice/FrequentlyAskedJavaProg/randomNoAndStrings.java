package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class randomNoAndStrings {
    public static void main(String args[])
    {
        //Approach-1
     /*   Random ran=new Random();
        int num= ran.nextInt(100);
        System.out.println(num);

        //Approach-2
        Math.random();
*/
        //Approach-3 : Apache commas lang api \
        String randnum=RandomStringUtils.randomNumeric(5);
        System.out.println(randnum);

        String randstr=RandomStringUtils.randomAlphabetic(5);
        System.out.println(randstr);
    }
}
