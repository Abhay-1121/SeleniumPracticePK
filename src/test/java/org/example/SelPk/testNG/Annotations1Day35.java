package org.example.SelPk.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1Day35 {
    @BeforeMethod
    void login()
    {
        System.out.println("Login...");
    }

    @Test(priority=1)
    void search()
    {
        System.out.println("Search...");
    }

    @Test(priority=2)
    void advacedsearch()
    {
        System.out.println("Advanced search...");
    }

    @AfterMethod
    void logout()
    {
        System.out.println("Logout...");
    }
}
