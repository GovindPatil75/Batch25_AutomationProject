package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_4 {

	public static void main(String[] args) {
		
		// Browser Open 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// WebELement Identify -- XPath By attribute 
		//tagname[@attribute name='attribute value']
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		FirstName.sendKeys("Test");
		
		
	}

}
