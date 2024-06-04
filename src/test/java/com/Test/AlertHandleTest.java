package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		// Enter Customer id 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("T12345");
		
		//click on Submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//Alert Handle 
		Alert alt=driver.switchTo().alert();
		
		//text Alert 
		String Alerttext=alt.getText();
		System.out.println(Alerttext);
		
		//click on cancel button
		//alt.dismiss();
		
		//click on OK button
		alt.accept();
		
		// 2nd Alert 
		
		String text2=alt.getText(); // 2nd alert text
		System.out.println(text2);
		
		alt.accept(); // click 2nd alert OK button
		
		
		
	}

}
