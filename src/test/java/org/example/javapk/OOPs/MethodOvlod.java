package org.example.javapk.OOPs;

public class MethodOvlod {
    int x ,y,z;
    double d;
    void sum() //1
    {
        x=10;
        y=20;
        System.out.println(x+y);
    }
    void sum(int a,int b)//2
    {
        x=a;
        y=b;
        System.out.println(x+y);
    }
    void sum(int a,double b)//3
    {
        x=a;
        d=b;
        System.out.println(x+d);
    }
    void sum(double b,int a)//4
    {
        x=a;
        d=b;
        System.out.println(x+d);
    }
    public static void main(String[]args)
    {
        MethodOvlod mo= new MethodOvlod();
        mo.sum(); //1
        mo.sum(100,200);//2
        mo.sum(100,20.8);//3
        mo.sum(10.7,20);//4
    }

    /*  4 rules to applicable in overloading
    * 1) Method names should be same
    * 2) No of parameters should be different
    * 3) data type of parameters should be different
    * 4) Order of parameters should be different
    * */


}
