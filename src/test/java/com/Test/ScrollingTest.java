package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Scrolling - pixel
		
		// top -bottom
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(3000); // 3 sec
		
		//bottom -top
		js.executeScript("window.scrollBy(0,-400)", "");
		
		Thread.sleep(3000); // 3 sec
		
		//Scrolling -WebElement 
		
		WebElement EnglishUK=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		
		js.executeScript("arguments[0].scrollIntoView();", EnglishUK);
		
		
		Library.getScrollingWebElement(driver, EnglishUK);

	}

}
