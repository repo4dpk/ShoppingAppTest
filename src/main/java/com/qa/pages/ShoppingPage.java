package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ShoppingPage extends TestBase{
	
	@FindBy(xpath="//a[@class='sf-with-ul' and @title='Women']")
	WebElement womenSection;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement tshirtSection; 
	
	public ShoppingPage() {
	PageFactory.initElements(driver, this);
	}
	
	public void naviTishirt() {
		Actions action = new Actions(driver);
		action.moveToElement(womenSection).build().perform();
		tshirtSection.click();
	}
	
	

}
