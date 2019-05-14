package com.allianz.java;

public class Car implements Vehicle{

	String type;
	String name;
	
	public Car(String typeofvehicle) {
		type = typeofvehicle;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void start() {
		System.out.println(name+ " Started..");
	}

	@Override
	public void stop() {
		System.out.println(name+" Stopped..");
	}
	
	public void openWindows() {
		System.out.println(name+ " Opening windows..");
	}


}
