package com.allianz.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGSeleniumTest {

	WebDriver driver;
	
	@BeforeSuite
	public void suiteSetup() {
		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/Ameya/tools/selenium/chromedriver");
		System.setProperty("webdriver.ie.driver", "/Users/Ameya/tools/selenium/iedriver");
	}
	
	@BeforeTest
	public void setUp() {	
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void navigateToAllianz() {	
		//Test Case Step 1
		driver.navigate().to("https://www.allianz.com");
		//Test Case Step 2
		driver.navigate().back();
		//Test Step 3
		Assert.assertEquals(driver.getTitle(),"Google");
		//Test Step 4 - Not reachable if Assert above fails
		driver.navigate().forward();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
