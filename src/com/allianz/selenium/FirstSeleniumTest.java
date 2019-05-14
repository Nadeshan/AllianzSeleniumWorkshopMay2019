package com.allianz.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
		
		//For Windows Systems below
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\tools\\selenium\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().setSize(new Dimension(600, 800));
		
	}

}
