package com.PageObjectModelTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyKeywordDependsOnMethods {

	
	@Test
	public void loginTest() {
		
		Assert.assertTrue(false);
		System.out.println("Login Test");
	}
	
	
	@Test(dependsOnMethods="loginTest")
	public void HomepageTest() {
		System.out.println("Homepage Test");
	}
}
