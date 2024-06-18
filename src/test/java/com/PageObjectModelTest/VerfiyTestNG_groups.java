package com.PageObjectModelTest;

import org.testng.annotations.Test;

public class VerfiyTestNG_groups {
	
	// p1,p2 -- Critcial Regression
	// P3,p4,p5 -- Regression
	
	@Test(groups= {"Critical Regression","Regression"})
	public void p1() {
		System.out.println("Test P1");
	}
	
	@Test(groups= {"Critical Regression"})
	public void p2() {
		System.out.println("Test P2");
	}
	
	@Test(groups= {"Regression"})
	public void p3() {
		System.out.println("Test P3");
	}
	
	@Test(groups= {"Regression"})
	public void p4() {
		System.out.println("Test P4");
	}
	
	@Test(groups= {"Regression"})
	public void p5() {
		System.out.println("Test P5");
	}

}
