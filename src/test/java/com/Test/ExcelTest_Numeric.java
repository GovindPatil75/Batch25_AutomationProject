package com.Test;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelTest_Numeric {

	public static void main(String[] args) throws Exception {
		
		String filepath=System.getProperty("user.dir")+"\\TestData\\data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		double data=wb.getSheet("Sheet1").getRow(0).getCell(4).getNumericCellValue();
		
		System.out.println(data);
		
		String data_1=String.valueOf(data);
		
		System.out.println(data_1);
		
		String data_2=data_1.replace(".0", "");
		
		System.out.println(data_2);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(data_2);
	}

}
