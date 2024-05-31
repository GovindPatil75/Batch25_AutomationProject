package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExcelSheetdata {

	public static void main(String[] args) throws Exception {
		
		// define excel location 
		
		String filepath=System.getProperty("user.dir")+"\\TestData\\data.xlsx";
		
		// create object of FileInputStream class -- constr -excel location
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//XSSFWorkbook class - object create -- constr -- object of FileInputStream
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(data_1);
		
		String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data_2);
		
		String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data_3);
		
		String data_4=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(data_4);
		//Browser Open
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(data_1);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(data_2);
		
	}

}
