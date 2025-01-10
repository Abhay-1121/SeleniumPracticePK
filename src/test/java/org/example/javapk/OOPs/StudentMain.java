package org.example.javapk.OOPs;

public class StudentMain {

    public static void main(String[] args)
    {
        //Student s1=new Student();

        //Approach 1: using referance variable
       /* s1.sid=102;
        s1.sname="Manoj";
        s1.grade='A';
        s1.show(); */

        //Approach 2: using method
        /* s1.setData(104,"balu",'A');
           s1.show(); */

        //Approach 3: using constructor
        Student s2=new Student(105,"shubz",'A');
        s2.show();
    }
}

