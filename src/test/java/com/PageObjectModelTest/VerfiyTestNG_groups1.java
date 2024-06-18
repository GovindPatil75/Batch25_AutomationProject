package com.PageObjectModelTest;

import org.testng.annotations.Test;

public class VerfiyTestNG_groups1 {

	
	@Test(groups= {"Critical Regression"})
	public void m1() {
		System.out.println("Test m1");
	}
	
	@Test(groups= {"Regression"})
	public void m2() {
		System.out.println("Test M2");
	}
}
