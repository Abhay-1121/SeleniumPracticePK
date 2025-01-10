package org.example.javapk.OOPs;

public class StaticMain {
    public static void main(String[]args)
    {
        //1) static methods can access static stuff directly(without object)
        System.out.println(StaticExample.a);//3)if we want to access static variable or method from another class then must have to
        //specify with classname
        //System.out.println(b); //incorrect, bcoz b is non-static variable

        StaticExample.m1();
        // m2(); incorrect bcz m2() is non-static method

        //2) static methods can access non-static stuff through object
        StaticExample se = new StaticExample();
        System.out.println(se.b);
        se.m2();
        se.m();


    }
}
