package com.allianz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class PersonalInformation extends SeleniumBase{

	public static void main(String[] args) {
		new SeleniumBase("Firefox", 
				"http://seleniumwebdriver.training/aut-samplepersonalinformationform/",
				new Dimension(600,800));
		
		driver.findElement(By.xpath("//p[8]/input")).sendKeys("7897654321");;
	}

}
