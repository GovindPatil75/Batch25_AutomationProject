package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleTest {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// Case 1 : Mainpage -- Frame 1
		WebElement Frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

		driver.switchTo().frame(Frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test1");
		
		driver.switchTo().defaultContent(); // Farme1 -Mainpage 
		
		// Mainpage ---Frame 2
		driver.switchTo().frame(1); // Frame 2
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test2");
		
		driver.switchTo().defaultContent(); // Farme2 -Mainpage 
		
	}

}
