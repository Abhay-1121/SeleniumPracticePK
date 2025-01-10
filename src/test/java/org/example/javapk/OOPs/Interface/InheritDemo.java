package org.example.javapk.OOPs.Interface;

interface Shape
{
    int length=10;   // final & static
    int width=20;    // final & static
    void circle();   // abstract method- un-implemented
    default void sqaure()   // default method
    {
        System.out.println("this is sqaure- defualt method");
    }
    static void rectangle()   // static method
    {
        System.out.println("this is rectangle");
    }
}

public class InheritDemo implements Shape {
    public void circle()
    {
        System.out.println("this is circle ");
    }

    public static void main(String[] args)
    {
        InheritDemo idobj=new InheritDemo();

        idobj.circle();
        idobj.sqaure();

        Shape.rectangle();   // static method can directly access

        //Shape sh=new Shape();   // incorrect

        Shape sh=new InheritDemo();
        sh.circle();
        sh.sqaure();

    }
}
