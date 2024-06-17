package com.PageObjectModelTest;

import org.testng.annotations.Test;

public class VerifyKeyworsTestNG {
	
	@Test(priority=4 , invocationCount=3)
	public void abc() {
		System.out.println("Test ABC");
	}

	@Test(priority=3)
	public void xyz() {
		System.out.println("Test XYZ");
	}
	
	@Test(priority=2 ,invocationCount=2)
	public void RTS() {
		System.out.println("Test RTS");
	}
	
	@Test(priority=1 ,enabled=false)
	public void pqr() {
		System.out.println("Test PQR");
	}
	
	
	
}
