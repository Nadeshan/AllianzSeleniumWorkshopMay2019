package com.allianz.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestNGBase {
	
	static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/Ameya/tools/selenium/chromedriver");
		System.setProperty("webdriver.ie.driver", "/Users/Ameya/tools/selenium/iedriver");
	}
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void setUpMethod(@Optional("firefox") String browsername, @Optional("https://www.google.com") String urlstring) {
		
		switch (browsername) {
			case "firefox": driver = new FirefoxDriver();
				break;
			case "chrome": driver = new ChromeDriver();
				break;
			case "safari": driver = new SafariDriver();
				break;
			default: driver = new FirefoxDriver();
				break;
		}
		driver.get(urlstring);
	}
	
	@AfterMethod
	public void tearDownMethod() {
		driver.close();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
