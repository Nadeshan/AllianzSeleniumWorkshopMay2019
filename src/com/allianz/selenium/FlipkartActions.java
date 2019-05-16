package com.allianz.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartActions extends SeleniumBase{

	public static void main(String[] args) throws IOException, InterruptedException {

		new SeleniumBase("Chrome", 
				"https://www.flipkart.com",
				new Dimension(800,800));
		
		driver.findElement(By.cssSelector("._2AkmmA._29YdH8")).click();
		//driver.findElement(By.cssSelector(".LM6RPg")).sendKeys("iphone");
		
		WebElement searchbar = driver.findElement(By.cssSelector(".LM6RPg"));
		
		Actions builder = new Actions(driver);
		
		
		//builder.contextClick(searchbar).moveToElement(electronicselement).build().perform();
		
		builder.contextClick(searchbar);
		Action rightclick = builder.build();
		
		rightclick.perform();
		
		takeScreenshot();
		
		//builder.moveToElement(driver.findElement(By.className("AsXM8z"))).click();
		
		builder.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@title='Mobiles']/../../li/a"));
		
		//Thread.sleep(500);
		
		for (WebElement l : list) {
			new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(l));
			System.out.println(l.getText());
		}
	}

}
