package com.allianz.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	protected static WebDriver driver;
	
	public Base() {
		
//		System.out.println("Inside Default Base Constructor");
//		
//		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/Ameya/tools/selenium/chromedriver");
//		
//		System.setProperty("webdriver.ie.driver", "/Users/Ameya/tools/selenium/iedriver");
	}
	
	public Base(String browser, String url, Dimension d) {
		
		System.out.println("Inside Base Constructor");
		initializeDrivers();
		
		switch (browser) {
			case "Firefox": driver = new FirefoxDriver(); break;
			case "Chrome": driver = new ChromeDriver(); break;
			default: driver = new FirefoxDriver(); break;
		}
		
		driver.get(url);
		driver.manage().window().setSize(d);
	}

	public static void initializeDrivers() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
		
		System.setProperty("webdriver.chrome.driver", "/Users/Ameya/tools/selenium/chromedriver");
		
		System.setProperty("webdriver.ie.driver", "/Users/Ameya/tools/selenium/iedriver");
	}

}
