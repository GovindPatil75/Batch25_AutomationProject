package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserwindowHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String ParentWID=driver.getWindowHandle();
        System.out.println(ParentWID);
        
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        
        Set<String> ALLID=driver.getWindowHandles();
        System.out.println(ALLID);
        
        List<String> list=new ArrayList<String>(ALLID);
        
        String PWID=list.get(0);
        String CWID=list.get(1);
        
        System.out.println(CWID);
        System.out.println(PWID);
        
        driver.switchTo().window(CWID); // parent window -> Child window 
        
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
		
        driver.switchTo().window(ParentWID); // Child window -- >Parent window 
		
        //driver.close(); // Current window 
        
        driver.quit(); // Current window + Open window close
        
        WebElement Click=driver.findElement(By.xpath("//a[text()='Click Here']"));
        
        List<String> list1=Library.getSwitchtoChildWindow(driver, Click);
        
        driver.switchTo().window(list1.get(1));
        
        
	}

}
