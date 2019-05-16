package com.allianz.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class AlertExample extends SeleniumBase{

	public static void main(String[] args) {

		new SeleniumBase("Firefox", 
				"http://seleniumwebdriver.training/aut-alertspopups",
				new Dimension(600,800));
		
		driver.findElement(By.id("btnAlert")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		a.accept();
		
		driver.quit();
	}

}
