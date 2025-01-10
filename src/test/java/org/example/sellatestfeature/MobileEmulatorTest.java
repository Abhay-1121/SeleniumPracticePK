package org.example.sellatestfeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import java.util.Optional;

public class MobileEmulatorTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\Abhay\\Ashok It Automation\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        DevTools devTools= driver.getDevTools();
        devTools.createSession();
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        //sends commands to CDP -> CDP methods will invoke and get access to chrome dev tools
        devTools.send(Emulation.setDeviceMetricsOverride(600,1000, 50, true, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
       // driver.get("https://rahulshettyacademy.com/angularAppdemo/");

        driver.findElement(By.cssSelector(".navbar-toggler")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Library")).click();


    }
}
