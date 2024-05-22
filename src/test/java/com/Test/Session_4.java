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
		
		//WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		//FirstName.sendKeys("Test");
		
		// WebElement Identify - Xpath by text()
		//tagname[text()='text value']
		
		//WebElement RegisterLink=driver.findElement(By.xpath("//a[text()='REGISTER']"));
		//RegisterLink.click();
		
		
		// WebElement Identify - Xpath By Contains()
		//tagname[contains(@attribute name ,'static value')]
		//tagname[contains(text(),'partial value text')]
		
		//WebElement Email=driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		//Email.sendKeys("Test@gmail.com");
		
		//WebElement SignUp=driver.findElement(By.xpath("//a[contains(text(),'SIGN')]"));
		
		// WebElement Identify -- Xpath  By Index
		//(Xpath Expression)[index]
		
		WebElement UserName=driver.findElement(By.xpath("(//input[@maxlength='60'])[5]"));
		UserName.sendKeys("Test");
		
	}

}
