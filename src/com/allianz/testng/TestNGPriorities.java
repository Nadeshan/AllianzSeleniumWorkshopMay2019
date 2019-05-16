package com.allianz.testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriorities {

	@Test
	public void myFirstTest() {
		System.out.println("Inside myFirstTest");
	}
	
	@BeforeTest
	public void testSetUp() {
		System.out.println("Inside testSetUp");
	}
	
	@Test
	public void mySecondTest() {
		System.out.println("Inside mySecondTest");
	}

	@AfterTest
	public void testTearDown() {
		System.out.println("Inside testTearDown");
	}
	
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("Inside setUpMethod");
	}
	
	@AfterMethod
	public void tearDownMethod() {
		System.out.println("Inside tearDownMethod");
	}
	
	@BeforeSuite
	public void suiteSetUp() {
		System.out.println("Inside suiteSetUp");
	}
	
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("Inside suiteTearDown");
	}
}
