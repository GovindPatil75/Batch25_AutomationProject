package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));

		Actions act=new Actions(driver);
		
		// Element ,shift down -data enter -shift Up
		
		act.keyDown(email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		
		//select  data --ctrl+a
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//ctrl +c
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//element click
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		
		//ctrl +v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		Library.getCopyPasteAction(driver, email,driver.findElement(By.xpath("//input[@id='pass']")));
		
		
		
	}

}
