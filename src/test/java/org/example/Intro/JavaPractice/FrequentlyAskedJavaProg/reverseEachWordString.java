package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;

public class reverseEachWordString {
    public static void main(String[] args)
    {
        String str="Welcome to automation"; //original string

        String[] strword=str.split(" ");  //splitting string into words

        String reverseString="";

        for (String w:strword)
        {
            String reverseword="";
            for(int i=w.length()-1;i>=0;i--)
            {
                reverseword=reverseword+w.charAt(i);
            }
            reverseString=reverseString+reverseword+" ";
        }
            System.out.println(reverseString);
    }
}
