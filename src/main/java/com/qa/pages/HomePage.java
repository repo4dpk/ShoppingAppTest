package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(linkText="Sign in")
	WebElement signIn;

	@FindBy(css = "div#header_logo")
	WebElement logo;
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String homePageTitle() {

		return driver.getTitle();
		//driver.findElement(By.linkText(linkText))
	}

	public boolean homePageLogo() {
		return logo.isDisplayed();
	}

	public LoginPage clickToSignIn() {
		LoginPage loginPage = new LoginPage();
		signIn.click();
		return loginPage;
	}

}
