package com.allianz.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {

	static WebDriver driver;
	
	public SeleniumBase() {
		
	}
	
	public SeleniumBase(String browser, String url, Dimension d) {
		System.setProperty("webdriver.gecko.driver", "/Users/Ameya/tools/selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/Ameya/tools/selenium/chromedriver");
		System.setProperty("webdriver.ie.driver", "/Users/Ameya/tools/selenium/iedriver");
		
		
		switch (browser) {
			case "Firefox":	driver = new FirefoxDriver();	break;
			case "Chrome":	driver = new ChromeDriver();	break;
			case "IE":		driver = new InternetExplorerDriver(); break;
			default: driver = new FirefoxDriver(); break;
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().setSize(d);
		
	}
	
	public static void wait(int seconds, WebElement e, String method) {
		WebDriverWait myWait = new WebDriverWait(driver, 10);
		switch (method) {
		case "clickable":myWait.until(ExpectedConditions.elementToBeClickable(e));
			break;
		default:
			break;
		}
		
		
	}
	
	
	
	
	public static void preRequisites() {
		// Pre requisites
				
				driver = new FirefoxDriver();
				
				driver.get("https://www.google.com");
				
				driver.manage().window().setSize(new Dimension(600,800));
	}
	
	public static void ScrollToElement(WebDriver d, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;	
		js.executeScript("arguments[0].scrollIntoView();", e);
	}
	
	public static void takeScreenshot() throws IOException {
		File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(myFile, new File("/Users/Ameya/tools/selenium/screenshot.jpg"));
	}
	
}
