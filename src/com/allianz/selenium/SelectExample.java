package com.allianz.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectExample extends SeleniumBase{

	public static void main(String[] args) {
		new SeleniumBase("Firefox", 
				"http://seleniumwebdriver.training/aut-samplepersonalinformationform/",
				new Dimension(600,800));
		
		WebElement comboobject = driver.findElement(By.cssSelector("select[name='Colors']"));
		
		Select dropdown = new Select(comboobject);
		
		List<WebElement> options = dropdown.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());	
		}
		
		dropdown.selectByVisibleText("Black");
		
		
	}

}
