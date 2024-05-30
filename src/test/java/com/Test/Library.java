package com.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
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
	
	public static void getDragAndDropAction(ChromeDriver driver,WebElement src,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
	}
	
	public static void getCopyPasteAction(ChromeDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		element.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}
	
}
