package com.CorssBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerfiyRegisterPage {
	
	@Test
	public void VerifyRegisterPage_TC001() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		String ExpectedTitleHomepage="Automation Exercise";
		String ActualTitleHomepage=driver.getTitle();
		
		//verify
		Assert.assertEquals(ActualTitleHomepage, ExpectedTitleHomepage);
	
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		WebElement NewUserSignUp=driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		boolean Value=NewUserSignUp.isDisplayed();
		
		// Verify
		Assert.assertTrue(Value);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Govin");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Test77@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		//Verify
		WebElement EnterActInfo=driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		boolean VerifyValue=EnterActInfo.isDisplayed();
		
		Assert.assertTrue(VerifyValue, "Verify Enter Account Information");
		
		
	
	}

}
