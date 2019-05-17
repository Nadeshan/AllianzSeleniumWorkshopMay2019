package com.allianz.testng;

import org.testng.annotations.Test;

public class ParallelTests {
	
	@Test
	public void test1() throws InterruptedException { 
		System.out.println("Inside Test 1");
		Thread.sleep(5000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Inside Test 2");
		Thread.sleep(5000);
	}
	
	@Test
	public void test3() throws InterruptedException {
		System.out.println("Inside Test 3");
		Thread.sleep(5000);
	}
}
