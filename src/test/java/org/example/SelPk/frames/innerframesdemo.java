package org.example.SelPk.frames;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class innerframesdemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame1
        WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frm1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
        driver.switchTo().defaultContent();

        //Frame3
        WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frm3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");

        //inner frame
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame
        driver.switchTo().defaultContent();


        //frame2



        //frame 4



        //frame 5


    }
}
