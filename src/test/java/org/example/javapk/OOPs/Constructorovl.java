package org.example.javapk.OOPs;

public class Constructorovl {

    int x,y;
    double d;
    Constructorovl()//1
    {
        x=10;
        y=20;
    }
    Constructorovl(int a,int b)//1
    {
        x=a;
        y=b;
    }
    Constructorovl(int a,double b)//1
    {
        x=a;
        d=b;
    }
    Constructorovl(double b,int a)//1
    {
        x=a;
        d=b;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
    }
    public static void main(String[]args)
    {
        Constructorovl mo= new Constructorovl(100,20.7);
        mo.display(); //1

    }

}
