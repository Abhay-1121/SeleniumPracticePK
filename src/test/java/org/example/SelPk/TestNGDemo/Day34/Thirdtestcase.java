package org.example.SelPk.TestNGDemo.Day34;
import org.testng.annotations.Test;

public class Thirdtestcase {
    @Test(priority=0)
    void test1()
    {
        System.out.println("testing 1");
    }

    @Test(priority=2)
    void test2()
    {
        System.out.println("testing 2");

    }

    @Test(priority=3)
    void test3()
    {
        System.out.println("testing 3");
    }
}
