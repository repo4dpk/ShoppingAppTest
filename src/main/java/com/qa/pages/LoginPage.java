package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement pwd;
	
	@FindBy(id="SubmitLogin")
	WebElement submit;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public ShoppingPage login(String uname, String password) {
		email.sendKeys(uname);
		pwd.sendKeys(password);
		submit.click();
		return new ShoppingPage();
		
	}
	
	
	

}
