package org.example.Intro.JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args)
    {
        //Hashset treeset, Linkedhashset implements set interface
        //does not accept duplicate values
        // There is no gurrantee elements stored in sequential order.

        HashSet<String> hs=new HashSet<String>();
        hs.add("USA");
        hs.add("JAPAN");
        hs.add("INDIA");
        hs.add("He");
        hs.add("She");

        System.out.println(hs);
      //  System.out.println(hs.remove("USA"));
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

        Iterator<String> i= hs.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
