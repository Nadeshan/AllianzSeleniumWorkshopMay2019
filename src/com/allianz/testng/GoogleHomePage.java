package com.allianz.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends POMBase{
	
	@FindBy(name="q")
	WebElement searchbox;
	
	@FindBy(name="btnK")
	WebElement searchbutton;
	
	@FindBy(name="btnI")
	WebElement feelingluckybutton;
	
	public GoogleHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchString(String searchstring) {
		//searchbox.clear();
		searchbox.sendKeys(searchstring);
	}
	
	public void clickSearch() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(searchbutton));
		searchbutton.click();
	}

}
