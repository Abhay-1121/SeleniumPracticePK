package org.example.SelPk.MSexcel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String args[])
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //single file upload
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("A:\\test.txt");
        String ele=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
        if (ele.equals("test.txt"))
        {
            System.out.println("file is uploaded successfully");
        }else
        {
            System.out.println("file is not uploaded");
        }

    }
}
