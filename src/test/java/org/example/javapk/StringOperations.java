package org.example.javapk;

import java.lang.ref.SoftReference;

public class StringOperations {

    public static void main(String[]args)
    {
        String s ="welcome";
        String s1 = new String("hello");
        //length() -returns length of string
        System.out.println(s1.length());//5 numbers of characters

        //concat - joining strings
        String a="welcome";
        String a1="to java";
        String a2="automation";
        System.out.println(a+a1);//welcometo java
        System.out.println(s.concat(a1));//welcometo java
        System.out.println(s.concat(a1).concat(a2));//welcometo javaautomation

        //trim() - to remove spaces right and left
        String t = "    auto    ";
        System.out.println(t.length());//12
        String res =t.trim();
        System.out.println(res.length());//4

        //charAt() - returns a single char based on index we passed
        String t1="India";
        System.out.println(t1.charAt(0));//I
        System.out.println(t1.charAt(2));//d

        //contains() - returns boolean
        System.out.println(t1.contains("In"));//true
        System.out.println(t1.contains("ia"));//true
        System.out.println(t1.contains("bye"));//false

        //equals()-it will check case sensesative, equalsIgnoreCase(): it will ignore case sensativeness - compare 2 strings and return boolean value
       String s4 = "welcome";
       String s5 = "WELCOME";
       System.out.println(s4.equals(s5));
       System.out.println(s4.equalsIgnoreCase(s5));

       //replace()- replace single/multiple characters in a string
        String s6="welcome to selenium automation testing selenium training";
        System.out.println(s6.replace('e','V'));//wVlcomV to sVlVnium automation tVsting sVlVnium training
        System.out.println(s6.replace("selenium","java"));//welcome to java automation testing java training

        //substring() - to extract substring from main string
        String s7="welcome";
        System.out.println(s7.substring(2,5));
        System.out.println(s7.substring(0,6));

        //split() - divide the string into multiple parts using delimeter should not use * ^ $ . + -
        String s8="abc@gmail.com";
        String U[]=s8.split("@");
        System.out.println(U[0]);//abc
        System.out.println(U[1]);//gmail.com

        //toUppercase() , toLowercase()
        String s9="welCOME";
        System.out.println(s9.toLowerCase());
        System.out.println(s9.toUpperCase());

        // Case1: using (==) and equals()
        String s10=new String("welcome");
        String s11=new String("welcome");

        System.out.println(s10==s11);//false compare objects
        System.out.println(s10.equals(s11));//true compare value of objects

        //Case 2:
        String s12="abc";
        String s13=new String("abc");
        String s14=s13;
        System.out.println(s12==s13);//false
        System.out.println(s12.equals(s13));//true
        System.out.println(s13==s14);//true
        System.out.println(s13.equals(s14));//true

















    }
}
