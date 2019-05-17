package com.allianz.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POMGoogleSearch extends POMBase{
	
	@Test(dataProvider="getData")
	public void searchAndVerify(String searchstring, String expectedresult) throws InterruptedException {
		driver.get("https://www.google.com");
		
		GoogleHomePage homepage = new GoogleHomePage();
		homepage.enterSearchString(searchstring);
		homepage.clickSearch();
		
		GoogleResultsPage resultspage = new GoogleResultsPage();
		String actualresult = resultspage.getFirstResult();
		
		Assert.assertEquals(actualresult, expectedresult);
	}
	
	@DataProvider
	public Object[][] getData() {
		// rows - number of time test has to be repeated
		// cols - number of parameters in test data
		Object[][] data = new Object[3][2];
		// 1st row
		data[0][0] = "Selenium";
		data[0][1] = "Selenium - Web Browser Automation";
		// 2nd row 
		data[1][0] = "TestNG";
		data[1][1] = "TestNG - Welcome";
		
		// 3rd row 
		data[2][0] = "POM";
		data[2][1] = "POM Wonderful";
		
		return data;
	}
	
	@DataProvider
	public Object[][] getDatafromExcel() throws IOException {
		// rows - number of time test has to be repeated
		// cols - number of parameters in test data
		Object[][] data = readExcelData("/Users/Ameya/Tools/Selenium/GoogleSearchTestData.xlsx");
		
		return data;
	}

	public static Object[][] readExcelData(String fileName) throws IOException 
	{
		System.out.println("abc");
		String sheetName = "Sheet1";
		
		File file =	new File(fileName);
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		
		System.out.println("abc");
		
		Workbook Workbook = new XSSFWorkbook(inputStream);
	
		//Read sheet inside the workbook by its name
		Sheet  mySheet = Workbook.getSheet(sheetName);
		 int rowCount = mySheet.getLastRowNum();
		 int colCount = mySheet.getRow(0).getPhysicalNumberOfCells();
		 colCount = colCount -1;
		 System.out.println("No of rows " + rowCount + "No of cols " + colCount);
         Object[][] object = new Object[rowCount][colCount];
     	 
         for (int i = 0; i < rowCount; i++) {
    		//Loop over all the rows
     		System.out.println("Row :" + i);
    		Row row = mySheet.getRow(i+1);
    	
    		//Create a loop to print cell values in a row
    		for (int j = 0; j < colCount; j++) {
    			//Print excel data in console
    			object[i][j] = row.getCell(j).toString();
    			System.out.println(object[i][j]);
    		}
    		
    	}
        Workbook.close();
		return object;
	}
	
	

}
