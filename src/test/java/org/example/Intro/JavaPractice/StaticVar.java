package org.example.Intro.JavaPractice;

public class StaticVar {

    String name;//instance variable
    String address;
    static String city;//class variable
    static int i=0;

    static
    {
        city="banglore";
        i=0;
    }

    StaticVar(String name, String address)
    {
        this.name=name;
        this.address=address;
        i++;
        System.out.println(i);
    }
    public void getAddress()//Instance methods
    {
        System.out.println(address+" "+city);
    }
    public static void getCity()//Class methods
    {
        System.out.println(city);
    }

    public static void main(String[] args)
    {
        StaticVar obj = new StaticVar("Bob","nagar");
        StaticVar obj1 = new StaticVar("Bola","pune");
        StaticVar obj2 = new StaticVar("Gola","solapur");
        obj.getAddress();
        obj1.getAddress();
        StaticVar.getCity();
        StaticVar.i=0;
        obj.address="nashik";

    }
}
