package org.example.SelPk.alerts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class bingSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().deleteAllCookies(); //deletes all the cookies in your browser

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.bing.com/");

        // driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("selenium");

        List<WebElement> list= driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]//span")); //working - using partial xpath

        System.out.println("size of elements"+ list.size());

        for (int i=0;i<list.size();i++)
        {
            if(list.get(i).getText().equals("selenium tutorial"))
            {
                list.get(i).click();
                break;
            }
        }
    }
}
