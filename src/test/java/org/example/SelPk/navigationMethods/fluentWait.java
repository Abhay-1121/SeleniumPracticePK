package org.example.SelPk.navigationMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class fluentWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Fluent wait declaration

        FluentWait mywait=new FluentWait(driver);
        mywait.withTimeout(Duration.ofSeconds(30));
        mywait.pollingEvery(Duration.ofSeconds(5));
        mywait.ignoring(NoSuchElementException.class);


        //usage
        WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");


    }
}
