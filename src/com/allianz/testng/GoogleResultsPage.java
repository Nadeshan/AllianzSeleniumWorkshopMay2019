package com.allianz.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage extends POMBase{
	
	@FindBy(css="a > h3.LC20lb")
	WebElement firstresult;
	
	public GoogleResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getFirstResult() throws InterruptedException {
		
		Thread.sleep(2000);
		return firstresult.getText();
	}
	
	
}
