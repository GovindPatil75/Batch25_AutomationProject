package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");

		driver.navigate().back();
		
		Thread.sleep(3000); // 3 sec
		
		driver.navigate().forward();
		
		Thread.sleep(3000); // 3 sec
		driver.navigate().refresh();
		*/
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Test@gmail.com");
		
		// password WebElement
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("12345678");
		
		// Login Button  // u_0_5_H8
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();
		
		// Verify 
		
		String ActualTitle=driver.getTitle();
		
		System.out.println(ActualTitle);
		
		String ExpectedTitle="FaceBook Homepage";
		
		if(ActualTitle.equals(ExpectedTitle)) {
			
			System.out.println("Test case Pass");
			
		}else {
			System.out.println("Test case Fail");
		}
		
	}

}
