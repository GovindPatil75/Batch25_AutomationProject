package com.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Session_6 {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Library.getScreenshot_fullPage(driver);
		
		
		//Full Page Screenshot
		
		//String RM=RandomString.make(3);
		
		//SimpleDateFormat formater=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//Date date=new Date();
		//String CurrentDate=formater.format(date);
		//String Cdate=CurrentDate.replace("/","_").replace(" ", "_").replace(":", "_");
	
		//String Location =System.getProperty("user.dir");
		//System.out.println(Location);
		//TakesScreenshot ts=driver;
		//File src=ts.getScreenshotAs(OutputType.FILE);
		//File destn=new File(Location+"\\"+Cdate+".png");
		//FileUtils.copyFile(src, destn);
		
		// WebELement Screenshot 
		
		//WebElement Register=driver.findElement(By.xpath("//img[@src='images/mast_register.gif']"));
		//File Src1=Register.getScreenshotAs(OutputType.FILE);
		//File destn1=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch25_AutomationProject\\Logo.png");
		//FileUtils.copyFile(Src1, destn1);
	
	   //Library.getWebElementScreenshot(Register);
	
	
	}

}
