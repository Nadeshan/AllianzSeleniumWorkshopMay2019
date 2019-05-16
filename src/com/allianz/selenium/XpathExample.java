package com.allianz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class XpathExample extends SeleniumBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SeleniumBase("Firefox","http://seleniumwebdriver.training/aut-sample/",new Dimension(800,800));
		
		WebElement e;
		driver.findElement(By.name("firstname")).sendKeys("Ameya");
		e = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[2]"));
		e.sendKeys("Naik");
		
		driver.findElement(By.xpath("//*[@type='radio' and @value = 'male']")).click();;
		
		
	}

}
