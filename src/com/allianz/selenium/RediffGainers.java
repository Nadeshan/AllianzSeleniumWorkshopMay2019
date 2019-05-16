package com.allianz.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class RediffGainers extends SeleniumBase {

	public static void main(String[] args) {
		new SeleniumBase("Firefox", 
				"https://money.rediff.com/gainers",
				new Dimension(600,800));
		
		WebElement table = driver.findElement(By.className("dataTable"));
		
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		
		System.out.println("Number of rows: "+rows.size());
		
		
//		for (WebElement tr : rows) {
//			System.out.println(tr.getText());
//		}
		
		int counter=0;
//		for (WebElement row : rows) {
//			if(counter>0) {
//				List<WebElement> columns = row.findElements(By.tagName("td"));
//				System.out.println("columns found:"+columns.size());
//				String currentpricestring = columns.get(3).getText();
//				double currentprice = Double.parseDouble(currentpricestring);
//				if (currentprice<100.00) {
//					System.out.println(counter+": "+columns.get(0).getText()+" : "+currentprice);
//				}
//			}
//			counter++;
//		}
		
		counter = 0;
		for (WebElement row : rows) {
			if(counter>0) {
				List<WebElement> columns = row.findElements(By.xpath("./td"));
				//System.out.println("columns found:"+columns.size());
				String currentpricestring = columns.get(3).getText();
				currentpricestring = currentpricestring.replace(",","").trim();
				double currentprice = Double.parseDouble(currentpricestring);
				if (currentprice<100.00) {
					System.out.println(counter+": "+columns.get(0).getText()+" : "+currentprice);
				}
			}
			counter++;
		}
		
	}

}
