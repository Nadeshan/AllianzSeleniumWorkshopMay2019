package com.allianz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends SeleniumBase{

	public static void main(String[] args) {
		
		new SeleniumBase("Firefox", 
				"http://jqueryui.com/slider",
				new Dimension(800,800));

		driver.switchTo().frame(0);
		
		int maxXoffset = driver.findElement(By.id("slider")).getSize().width;
		System.out.println(maxXoffset);
		
		WebElement slider = driver.findElement(By.className("ui-slider-handle"));
		
		Actions myaction = new Actions(driver);
		myaction.clickAndHold(slider).moveByOffset(50, 0).release().build().perform();;
		//myaction.dragAndDropBy(Slider, maxXoffset/2, 0).build().perform();

	}

}
