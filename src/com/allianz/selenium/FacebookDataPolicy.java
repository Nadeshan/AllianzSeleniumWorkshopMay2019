package com.allianz.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDataPolicy extends SeleniumBase{

	public static void main(String[] args) throws InterruptedException {
		
		new SeleniumBase("Chrome",
						 "https://www.facebook.com",
						 new Dimension(600,800));
		
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		String mainhandle = driver.getWindowHandle();
		new WebDriverWait(driver, 5).until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i = handles.iterator();
		
		while (i.hasNext()) {
			//System.out.println(i.next());
			driver.switchTo().window(i.next());
			//System.out.println(driver.findElement(By.id("pageTitle")).getAttribute("innerHTML"));
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Data Policy")) {
				System.out.println(
						driver.findElement(By.className("_1rf2")).getText()
						);
				driver.close();
			}
		}
		
		driver.switchTo().window(mainhandle);
		System.out.println(driver.getTitle());
	}
}
