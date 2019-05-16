package com.allianz.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends SeleniumBase {
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		new SeleniumBase("Firefox", "https://www.google.com", new Dimension(600,800));
	
		File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(myFile, new File("/Users/Ameya/tools/selenium/screenshot.jpg"));

	}
}
