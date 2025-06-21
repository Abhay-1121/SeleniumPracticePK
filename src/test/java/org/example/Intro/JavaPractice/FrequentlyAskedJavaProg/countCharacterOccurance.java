package org.example.Intro.JavaPractice.FrequentlyAskedJavaProg;
//to count character how many times repeat.
public class countCharacterOccurance {

    public static void main(String[] args)
    {
        String s="Java programming Selenium";

        int totalcount=s.length();
        int afterremovecount=s.replaceAll("e","").length();
        int count=totalcount-afterremovecount;
        System.out.println("Count after removal "+count);
    }
}
