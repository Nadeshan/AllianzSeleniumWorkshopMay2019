package com.allianz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class FirstSeleniumTest extends SeleniumBase{

	public static void main(String[] args) {
		
		new SeleniumBase("Firefox", "https://www.yahoo.com", new Dimension(600,800));
		
		//Test Case Step 1
		driver.navigate().to("https://www.allianz.com");
		
		//Test Case Step 2
		driver.navigate().back();
		
		//driver.findElement(By.name("q"));
	}
}
