package com.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library {

	
	public static void getScreenshot_fullPage(ChromeDriver driver) throws Exception {
		
		TakesScreenshot ts=driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		File Destn=new File(System.getProperty("user.dir")+"//"+"Test.png");
		FileUtils.copyFile(Src, Destn);
		
		
	}
	
	public static void getWebElementScreenshot(WebElement element) throws Exception {
		
		File src=element.getScreenshotAs(OutputType.FILE);
		File destn=new File(System.getProperty("user.dir")+"//"+"logo.png");
		FileUtils.copyFile(src, destn);
	}
	
	public static void handleDropDown(WebElement element,String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static Actions getAction(ChromeDriver driver) {
		
		Actions act=new Actions(driver);
		return act;
	}
	
}
