package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//https://demo.guru99.com/test/drag_drop.html
		driver.manage().window().maximize();
		
		WebElement SeleniumLink=driver.findElement(By.xpath("//a[text()='Selenium']"));
		
        Actions act=new Actions(driver);
        
        // Mouse Hover +Click
        act.moveToElement(SeleniumLink).click().perform();
        
        //WebElement Right click -context click
        //WebElement RightclickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
        
        //WebElement Delete=driver.findElement(By.xpath("//span[text()='Delete']"));
        //Element right click + option click 
        //act.contextClick(RightclickElement).click(Delete).build().perform();
        
        //WebElement DoubleclickElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        
        //Double click 
        //act.doubleClick(DoubleclickElement).build().perform();
        
       // Library.getAction(driver).doubleClick(DoubleclickElement).build().perform();
        
	}

}
