package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ShoppingPage;

public class ShoppingPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginPage;
	ShoppingPage shoppingPage;
	
	
	public ShoppingPageTest() {
		super();
	}
@BeforeMethod
public void setup() {
	driverInit();
	homepage = new HomePage();
	loginPage = new LoginPage();
	shoppingPage = new ShoppingPage();
	
}
	
@Test
public void naviTshirtTest() throws InterruptedException {
	loginPage = homepage.clickToSignIn();
	shoppingPage= loginPage.login(prop.getProperty("user"), prop.getProperty("password"));
	shoppingPage.naviTishirt();
	Thread.sleep(10000);
	Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=5&controller=category");
	
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
	
	
}
