package com.allianz.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchwithGrid {
	
	public String commonSearch(RemoteWebDriver driver, String searchstring) throws InterruptedException {
		
		driver.get("https://www.google.com");
		WebElement e = driver.findElement(By.name("q")); 
		e.sendKeys(searchstring);
		e.submit();
		
		Thread.sleep(2000);
		
		e = driver.findElement(By.cssSelector("a > h3.LC20lb"));
		String actual = e.getText();
		
		return actual;
	}
	
	@Test
	public void search1() throws InterruptedException, MalformedURLException {
		
		URL huburl = new URL("http://localhost:4444/wd/hub");
		
		FirefoxOptions capabilities = new FirefoxOptions();
		
		RemoteWebDriver griddriver = new RemoteWebDriver(huburl, capabilities);
		
		String actual = commonSearch(griddriver, "TestNG");
		String expectedresult = "TestNG - Welcome";
		
		Assert.assertEquals(actual, expectedresult);	
		
		griddriver.quit();
	}
	
	@Test
	public void search2() throws InterruptedException, MalformedURLException {
		
		URL huburl = new URL("http://localhost:4444/wd/hub/");
		
		FirefoxOptions capabilities = new FirefoxOptions();
		
		RemoteWebDriver griddriver = new RemoteWebDriver(huburl, capabilities);
		 
		String actual = commonSearch(griddriver,"Selenium");
		String expectedresult = "Selenium - Web Browser Automation";
		Assert.assertEquals(actual, expectedresult);
		
		griddriver.quit();
		
	}

}
