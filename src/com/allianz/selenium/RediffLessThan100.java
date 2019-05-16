package com.allianz.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class RediffLessThan100 extends SeleniumBase{

	public static void main(String[] args) {
		
		new SeleniumBase("Firefox", 
				"https://money.rediff.com/gainers",
				new Dimension(600,800));
		
		WebElement table = driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
		System.out.println(rows.size());
		
		for (WebElement row : rows) {
			List<WebElement> columns =row.findElements(By.tagName("td"));
			String currentpricestring = columns.get(3).getText();
			//System.out.println(currentpricestring);
			currentpricestring=currentpricestring.replace(",", "");
			Float currentprice;
			currentprice=Float.parseFloat(currentpricestring);
			
			if(currentprice<100.00) {
				System.out.println(columns.get(0).getText()+ " : " + currentprice);
			}
		}
		
		
		driver.quit();
	}

}
