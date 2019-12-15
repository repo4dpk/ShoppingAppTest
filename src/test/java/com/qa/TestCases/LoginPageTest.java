package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ShoppingPage;

public class LoginPageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	ShoppingPage shoppingPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		driverInit();
		homePage = new HomePage();
		loginPage = new LoginPage();
		
	}

	@Test
	public void loginTest() {
		loginPage = homePage.clickToSignIn();
		shoppingPage = loginPage.login(prop.getProperty("user"), prop.getProperty("password"));
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
