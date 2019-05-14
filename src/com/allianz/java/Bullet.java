package com.allianz.java;

public class Bullet {

	public static void main(String[] args) {

		Vehicle myBullet = new Car("Bike");
		
		String type = myBullet.getType();
		
		System.out.println(type);
		
		//myBullet.openWindows();
		
	}

}
