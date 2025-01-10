package org.example.sellatestfeature;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;

public class SetGeolocation {


    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "A:\\Abhay\\Ashok It Automation\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver= new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map<String,Object> coordinates = new HashMap<String,Object>();
        coordinates.put("latitude",46);
        coordinates.put("longitude",2);
        coordinates.put("accuracy",1);

        driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h3[contains(text(),'Netflix - Watch TV Shows Online, Watch Movies Onli')]")).click();
        String title = driver.findElement(By.cssSelector("h1[class='default-ltr-cache-jpuyb8 e9eyrqp8']")).getText();
        System.out.println(title);


    }
}
