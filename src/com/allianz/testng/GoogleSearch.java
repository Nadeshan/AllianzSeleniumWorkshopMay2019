package com.allianz.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch extends TestNGBase{
	
	@Test
	public void search1() throws InterruptedException {
		 
		WebElement e = driver.findElement(By.name("q")); 

		e.sendKeys("TestNG");
		e.submit();
		
		String expectedresult = "TestNG - Welcome";
		
		Thread.sleep(2000);
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a > h3.LC20lb"))));
		
		e = driver.findElement(By.cssSelector("a > h3.LC20lb"));
		String actual = e.getText();
		
		Assert.assertEquals(actual, expectedresult);	
	}
	
	@Test
	public void search2() throws InterruptedException {
		 
		WebElement e = driver.findElement(By.name("q")); 

		e.sendKeys("Selenium");
		e.submit();
		
		String expectedresult = "Selenium - Web Browser Automation";
		
		Thread.sleep(2000);
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a > h3.LC20lb"))));
		
		e = driver.findElement(By.cssSelector("a > h3.LC20lb"));
		String actual = e.getText();
		
		Assert.assertEquals(actual, expectedresult);
		
	}

}
