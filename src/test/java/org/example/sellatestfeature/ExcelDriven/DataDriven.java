package org.example.sellatestfeature.ExcelDriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class DataDriven {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        FileInputStream fis = new FileInputStream("A:\\Abhay\\SDETLive\\Rohitshetty selenium udemy\\DataDriven.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets=workbook.getNumberOfSheets();

        for(int i=0; i<sheets;i++)
        {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))
            {
                XSSFSheet sheet= workbook.getSheetAt(i);
            }

        }

    }
}
