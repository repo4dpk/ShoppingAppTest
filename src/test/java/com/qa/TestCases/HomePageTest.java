package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void launchBrowser() {
		driverInit();
		homePage = new HomePage();
	}

	@Test(priority = 1,enabled=false)
	public void logoTest() {
		Assert.assertTrue(homePage.homePageLogo());
	}

	@Test(priority = 2,enabled=false)
	public void titleTest() {
		String s = homePage.homePageTitle();
		Assert.assertEquals(s,"My Store");
	}
	@Test(priority = 3)
	public void signInTest() throws InterruptedException {
		homePage.clickToSignIn();
		Thread.sleep(10000);
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
