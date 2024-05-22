package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// WebELement -- Drop Down --Tagname -- Select class Handle
		
		WebElement Drp_Country=driver.findElement(By.xpath("//select[@name='country']"));

		Select sel=new Select(Drp_Country);
		
		//sel.selectByIndex(7);
		//sel.selectByValue("ARUBA");
		sel.selectByVisibleText("INDIA");
		
		//Verify DropDown option 
		
		List<WebElement> optionlist=sel.getOptions();
		
		int DropDownOptionCount=optionlist.size(); // 264
		
		System.out.println(DropDownOptionCount);
		
		
		// Drop Down Option -Console print 
		
		for(int i=0 ;i <DropDownOptionCount ;i++) {
			
			String text=optionlist.get(i).getText();
			System.out.println(text);
			
			if(text.equals("ARUBA")) {
				
				optionlist.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
