package com.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String PWID=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> ALLID=driver.getWindowHandles();
		
		Iterator<String> IT=ALLID.iterator();
		
		while(IT.hasNext()) {
			
			String CWID=IT.next();
			
			if(!PWID.equals(CWID)) {
				
				driver.switchTo().window(CWID);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
			}
		}
		
		
	}

}
