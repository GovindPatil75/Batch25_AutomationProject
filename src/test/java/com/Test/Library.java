package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
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
	
	public static void getCopyPasteAction(ChromeDriver driver,WebElement element,WebElement target) {
		Actions act=new Actions(driver);
		element.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		target.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}
	
	
	public static String getExcelTestData(String Sheetname,int row,int cell) throws Exception {
		
        String filepath=System.getProperty("user.dir")+"\\TestData\\data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data_1=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data_1;
	}
	
	
	public static void getScrollingWebElement(ChromeDriver driver ,WebElement element ) {
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public static List<String> getSwitchtoChildWindow(ChromeDriver driver,WebElement element) {
		
		element.click();
		Set<String> ALLID=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(ALLID);
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
