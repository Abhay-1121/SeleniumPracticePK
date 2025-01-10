package org.example.SelPk.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class authenticatedPopup {
    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        //http://the-internet.herokuapp.com/basic_auth
        //http://admin:admin@the-internet.herokuapp.com/basic_auth


        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();

        if(text.contains("Congratulations"))
        {
            System.out.println("successful login");
        }
        else
        {
            System.out.println("login failed");
        }
    }
}
