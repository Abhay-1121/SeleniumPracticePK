package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class reverseString {
    public static void main(String[] args) {

        //Approach1 length(), charAt()

        String s="selenium";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse string is:"+ rev);

        //Approach 2 : by converting string to char array type
        String s1 = "welcome";
        String reve="";

        char a[]=s1.toCharArray();

        for(int i=s1.length()-1;i>=0;i--)
        {
            reve= reve+a[i];
        }
        System.out.println("Reverse string :"+ reve);

        //Approach 3: By string builder class
        StringBuilder we=new StringBuilder("newtown");
        System.out.println("Reverse string :"+ we.reverse());

        //Approach 4: By string buffer class
        StringBuffer to=new StringBuffer("newcity");
        System.out.println("Reverse string is:"+ to.reverse());

    }
}
