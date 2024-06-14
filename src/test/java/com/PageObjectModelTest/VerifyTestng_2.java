package com.PageObjectModelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestng_2 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void verifyTestxyz() {
		
		System.out.println("verifyTestxyz");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test(priority=0)
	public void verifyTestabc() {
		
		System.out.println("verifyTestabc");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test(priority=-3)
	public void verifyTestpqr() {
		
		System.out.println("verifyTestpqr");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
