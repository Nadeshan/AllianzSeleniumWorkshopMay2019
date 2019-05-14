package com.allianz.java;

public class BMW {

	public static void main(String[] args) {
		
		Car myBMW = new Car("Car");
		
		myBMW.name = "720D";
		myBMW.type = "Diesel Car";
		
		myBMW.start();
		myBMW.stop();
		myBMW.openWindows();
		
	}

}
