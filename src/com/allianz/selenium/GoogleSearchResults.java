package com.allianz.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResults extends SeleniumBase{

	public static void main(String[] args) throws InterruptedException, IOException  {

		new SeleniumBase("Firefox","http://www.google.com",new Dimension(800,1000));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement e = driver.findElement(By.name("q"));
		
		e.sendKeys("Allianz");
		
		e = driver.findElement(By.name("btnK"));
		
		wait(10,e,"clickable");
		
		
		//SeleniumBase.ScrollToElement(driver, e);
		
		e.click();
		
		e = driver.findElement(By.className("st"));
		
		String s = e.getText();
		
		System.out.println(s);
		
		takeScreenshot();
		
	}

}
