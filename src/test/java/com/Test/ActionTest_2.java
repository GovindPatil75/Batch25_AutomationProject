package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest_2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// Src --- Target 
		
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, target).build().perform();
		
		Thread.sleep(2000);
		
		// case 2
		
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement Traget1=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		act.dragAndDrop(src1, Traget1).build().perform();
		
		//case 3
		
		Library.getDragAndDropAction(driver, src1, target);
		
		
	}

}
