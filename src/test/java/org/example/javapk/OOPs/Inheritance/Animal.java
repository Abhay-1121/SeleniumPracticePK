package org.example.javapk.OOPs.Inheritance;

public class Animal {
    String color="white";
    void eat()
    {
        System.out.println("eating.....");
    }
}
class Dog extends Animal
{

    String color="black";
    void displayColor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat()
    {
        System.out.println("eating bread");
        super.eat();
    }
    public static void main(String[] args)
    {
        Dog dg=new Dog();
        dg.displayColor();
        dg.eat();

        Animal an=new Animal();
        an.eat();
    }

}