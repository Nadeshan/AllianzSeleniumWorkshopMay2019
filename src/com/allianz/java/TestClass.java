package com.allianz.java;

public class TestClass {
	public static void main(String args[]) {
		BaseClass objbase;
		
		objbase = new BaseClass();
		objbase.methodToOverride();
		
		objbase = new DerivedClass();
		objbase.methodToOverride();
		
	}
}
