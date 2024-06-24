package com.CorssBrowserTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void verifyTC001() {
		
		System.out.println("Enter Email Id");
		System.out.println("Enter Password ");
		System.out.println("Click on Login Button");
		
		String Expected="ABC";
		String Actual="XYZ"; 
		
		// Soft Assert /Verify
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(Actual, Expected); // Fail
		
		System.out.println("Click on Login Button");
		System.out.println("Click on Login Button");
		System.out.println("Click on Login Button");
		
		soft.assertAll();
		
		
		
	}

}
