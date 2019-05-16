package com.allianz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends SeleniumBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new SeleniumBase("Firefox","http://www.google.com",new Dimension(800,800));

		WebElement e = driver.findElement(By.name("q"));
		
		e.sendKeys("Allianz");
		
		e = driver.findElement(By.name("btnK"));
		
		e.submit();
		
	}

}
