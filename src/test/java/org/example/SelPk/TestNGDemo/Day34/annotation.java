package org.example.SelPk.TestNGDemo.Day34;
import org.testng.annotations.Test;

public class annotation {
    @Test(priority=1)
    void openapp()
    {
        System.out.println("testing 1");
    }

    @Test(priority=2)
    void login()
    {
        System.out.println("testing 2");

    }

    @Test(priority=3)
    void logout()
    {
        System.out.println("testing 3");
    }

}
