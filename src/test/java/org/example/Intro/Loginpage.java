package org.example.Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Loginpage {
    WebDriver d;
    @BeforeSuite
    public void setup(){
        d= new ChromeDriver();
    }
    @Test(priority = 0,groups = "Negative")
    public void negative1() throws InterruptedException {
        d.get("http://app.vwo.com");
        WebElement email=d.findElement(By.name("username"));
        WebElement password=d.findElement(By.id("login-password"));
        WebElement button=d.findElement(By.id("js-login-btn"));
        WebElement notificationmessage =d.findElement(By.id("js-notification-box-msg"));
        email.sendKeys("93npu2yyb0@esiix.com1");
        password.sendKeys("password");
        button.click();
        Thread.sleep(6000);
        System.out.println("Textmessage:"+notificationmessage.getText());
        Assert.assertEquals(notificationmessage.getText(),"Your email, password, IP address or location did not match");

        //System.out.println("Title:"+d.getTitle());

    }
    @AfterSuite
    public void closebrowser(){
        if(d!=null){
            d.quit();
        }
    }
}
