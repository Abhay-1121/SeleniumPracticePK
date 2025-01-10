package org.example.javapk.OOPs;

public class StaticExample {
    static int a=10;//static variable
    int b=20;//non-static
    static void m1()
    {
        System.out.println("this is m1 static method");
    }
    void m2()
    {
        System.out.println("this is m2 non-static method");
    }
    void m()
    {
        System.out.println(a);
        System.out.println(b);

        m1();
        m2();
    }
   /* public static void main(String[]args)
    {
        //1) static methods can access static stuff directly(without object)
        System.out.println(a);
        //System.out.println(b); //incorrect, bcoz b is non-static variable

        m1();
       // m2(); incorrect bcz m2() is non-static method

        //2) static methods can access non-static stuff through object
        StaticExample se = new StaticExample();
        System.out.println(se.b);
        se.m2();
        se.m();


    } */
}
