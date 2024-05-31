package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		
		String username =Library.getExcelTestData("Sheet1", 0, 0);
		String password=Library.getExcelTestData("Sheet1", 0, 1);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(username);
		
		WebElement password1=driver.findElement(By.xpath("//input[@id='pass']"));
		password1.sendKeys(password);
		

	}

}
