package org.example.SelPk.MSexcel;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CDCalculator {
    private static ExcelUtils XLUtils;

    public static void main(String[] args) throws InterruptedException, IOException {
       // System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver_win32/chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator/");
        driver.manage().window().maximize();

        WebElement inideposit = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
        WebElement length = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
        WebElement apr = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
        WebElement calbutton = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")); // 'Lets run the numbers' button

        System.out.println("user has identified all elements to calculate CD");

        String path= System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";  // giving path to file to start reading
        int rows=XLUtils.getRowCount(path, "Sheet1");				// get a row count from the sheet
        System.out.println("row count is : " + rows);

        for(int i=1;i<=rows;i++)
        {
            //Reading data from excel
            String inidepo= XLUtils.getCellData(path,"Sheet1",i,0);				//file,sheet,row #, col zero for initial deposit
            String interestrate=XLUtils.getCellData(path,"Sheet1",i, 1);		//interest rate
            String monthlength=XLUtils.getCellData(path,"Sheet1",i, 2);			//length
            String compoundingmonths=XLUtils.getCellData(path,"Sheet1",i, 3);	//compounding
            String exptotal=XLUtils.getCellData(path,"Sheet1",i, 4);	//expected total , will be compared with actual total

            //passing the data into the application
            inideposit.clear();
            length.clear();
            apr.clear();
            Thread.sleep(3000);
            inideposit.sendKeys(inidepo);   //using webelement and passing the values from xl cell data
            length.sendKeys(monthlength);
            apr.sendKeys(interestrate);

            //Dropdown (Boostrap) - Not having Select Tag
            WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));   //select class object compounddrp will find elelment by id
            compoundrp.click();

            List<WebElement> options=driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));

            for(WebElement option:options)
            {
                if(option.getText().equals(compoundingmonths))
                    option.click();
            }


            calbutton.click();   ///click on button to calculate cd calculation based on xl cell data
            String acttotal = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();

            System.out.println("act total is: " + acttotal);
            System.out.println("exp total is: " + exptotal);

            if(exptotal.equals(acttotal)) {			//if expected total = actual total then

                XLUtils.setCellData(path, "Sheet1",i, 6,"Passed");	//setting passed in 6th column (index start with zero)
                XLUtils.fillGreenColor(path, "Sheet1",i, 6);	//filling the color in 6th column if passed then greeen or faile then red.
            }
            else
            {
                XLUtils.setCellData(path, "Sheet1",i, 6,"Failed");
                XLUtils.fillRedColor(path, "Sheet1",i, 6);
            }
        }
        System.out.println("calculation has been completed");
        driver.close();
    }
}
