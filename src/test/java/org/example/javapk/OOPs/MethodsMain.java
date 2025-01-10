package org.example.javapk.OOPs;

public class MethodsMain {

    public static void main(String []args)
    {
        Methods ms=new Methods();
        ms.methods();//Approach 1

        String str=ms.methods1();//Approach 2
        System.out.println(str);
        System.out.println(ms.methods1());//Approach 2

        ms.methods2("akshay");//Approach 3
        System.out.println(ms.methods3("sara"));//Approach 4


    }
}
