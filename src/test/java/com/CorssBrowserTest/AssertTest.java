package com.CorssBrowserTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
	@Test
	public void LoginTest001() {
		
		System.out.println("Enter Valid Email id");
		System.out.println("Enter Valid Password ");
		System.out.println("Click On login Button");
		
		//verify
		
		String ExpectedTitle="ABC";
	    
		String ActulaTitle= "XYZ"; //driver.gettitle(); // Login -XYZ
		
		Assert.assertEquals(ActulaTitle, ExpectedTitle);
		
		System.out.println("Welcome to Homepage");
		
	}
	
	@Test
	public void TC002() {
		System.out.println("TC 002");
	}

}
