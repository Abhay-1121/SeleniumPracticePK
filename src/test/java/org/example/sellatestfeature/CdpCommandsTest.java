package org.example.sellatestfeature;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class CdpCommandsTest {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "A:\\Abhay\\Ashok It Automation\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver= new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map deviceMetrics = new HashMap();
        deviceMetrics.put("width",600);
        deviceMetrics.put("height",1000);
        deviceMetrics.put("deviceScalerFactor",50);

        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride",deviceMetrics);
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.cssSelector(".navbar-toggler")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class=\"nav-link\"]")).click();

    }
}
