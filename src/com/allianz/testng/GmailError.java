package com.allianz.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailError {
	
	
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
	}
	
	@Test
	public void verifyPasswordError() {
		
		driver.findElement(By.name("identifier")).sendKeys("ameya.naik");
		driver.findElement(By.id("identifierNext")).click();
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("abcd");
		
		driver.findElement(By.id("passwordNext")).click();
		
		String ActualError = driver.findElement(By.className("GQ8Pzc")).getText();
		
		System.out.println(ActualError);
		
		Assert.assertTrue(ActualError.contains("Wrong password."));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
