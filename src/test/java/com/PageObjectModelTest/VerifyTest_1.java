package com.PageObjectModelTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTest_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getEmail().sendKeys("Test@gmail.com");
		login.getPassword().sendKeys("12345678");
		login.getLoginButton().click();
		
		

	}

}
