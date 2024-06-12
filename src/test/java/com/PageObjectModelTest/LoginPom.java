package com.PageObjectModelTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	// @FindBy(how=How.XPATH,using="xpath expression") private WebElement Element ;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']") 
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']") 
	private WebElement password;

	@FindBy(how=How.XPATH,using="//button[@name='login']") 
	private WebElement LoginButton;
	
	
	public WebElement getEmail() {
		
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}

}
