package com.CorssBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyProductTest {
	
	@Test
	public void VerifyProductDeatilsTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		SoftAssert soft=new SoftAssert();
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		String ExpectedProduct_Title="Automation Exercise - All Products";
		String ActualProduct_Title=driver.getTitle();
		
		//Verify Product Page
		soft.assertEquals(ActualProduct_Title, ExpectedProduct_Title);
		
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		
		//verify
		String ExpectedNameProduct="Blue Top" ;
		String ActualNameProduct=driver.findElement(By.xpath("//h2[text()='Blue Top']")).getText();
		soft.assertEquals(ActualNameProduct, ExpectedNameProduct);
		
		String ExpectedCatrgory="Category: Women > Tops";
		String ActualCategory=driver.findElement(By.xpath("//p[text()='Category: Women > Tops']")).getText();
		soft.assertEquals(ActualCategory, ExpectedCatrgory);
		
		soft.assertAll();
				
	}

}
