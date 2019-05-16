package com.allianz.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class FindElementAttributes extends SeleniumBase{

	public static void main(String[] args) {

		new SeleniumBase("Firefox", 
				"http://seleniumwebdriver.training/aut-samplepersonalinformationform/",
				new Dimension(600,800));
		
		List<WebElement> li = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		
		int counter=0;
		for (WebElement e : li) {
			counter++;
			System.out.println(counter+": " +e.getAttribute("name"));	
		}
	}
}
