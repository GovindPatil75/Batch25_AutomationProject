package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationTest {

	public static void main(String[] args) {

     // set up exeutable 
		WebDriverManager.chromedriver().setup();
		
	// ChromeDriver Browser driver class	

		ChromeDriver driver=new ChromeDriver();
		
	// get()
		driver.get("https://www.facebook.com/");
		
		//maximize
				driver.manage().window().maximize();
				
				// title webpage
				
				String Title=driver.getTitle();
				System.out.println(Title);
				
				String Url=driver.getCurrentUrl();
				System.out.println(Url);
				
				// browser current window -close
				
				//driver.close();
				
				// current window + all open window -- close 
				driver.quit();
		
		//Edge Browser
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver1=new EdgeDriver();
		//driver1.get("https://www.facebook.com/");
		
		
		
		
		
	}

}
