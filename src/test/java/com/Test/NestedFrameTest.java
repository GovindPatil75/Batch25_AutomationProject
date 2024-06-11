package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// MainPage --Outterframe -- Innerframe
		
		WebElement Outterframe=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
   
		driver.switchTo().frame(Outterframe); // MainPage -- Outterframe
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test");
		
		WebElement InnerFrame=driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(InnerFrame); // Outterframe -- Innerframe
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();

		
		//InnerFrame --OutterFrame --MainPage
		
		driver.switchTo().parentFrame();  //InnerFrame --OutterFrame
		
		driver.switchTo().defaultContent(); //OutterFrame --MainPage
		
		//MainPage --frame 4
		
		driver.switchTo().frame(3);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Test1");
		
		
		
	}

}
