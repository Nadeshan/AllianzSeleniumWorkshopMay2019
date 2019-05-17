package com.allianz.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestNGBase {
	
	static RemoteWebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/Ameya/tools/selenium/chromedriver");
		System.setProperty("webdriver.ie.driver", "/Users/Ameya/tools/selenium/iedriver");
	}
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void setUpMethod(@Optional("firefox") String browsername, @Optional("https://www.google.com") String urlstring) throws MalformedURLException {
		
		URL huburl = new URL("http://localhost:4444/wd/hub");
		
		switch (browsername) {
			case "firefox": 
				FirefoxOptions firefox = new FirefoxOptions();
				driver = new RemoteWebDriver(huburl, firefox);
				//driver = new FirefoxDriver();
				break;
			case "chrome": 
				ChromeOptions chrome = new ChromeOptions();
				driver = new RemoteWebDriver(huburl, chrome);;
				break;
			case "safari": 
				SafariOptions safari = new SafariOptions();
				new RemoteWebDriver(huburl, safari);
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
