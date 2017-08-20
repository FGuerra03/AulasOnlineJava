package com.schoolofnet;

public class Person {
	public String colorHair;
	public String eyeColor;
	public Float heigth;
	
	public Person() {
		System.out.println("Executing constructor...");
	}
	
	public Person(String colorHair, String eyeColor, Float height) {
		this.colorHair = colorHair;
		this.eyeColor = eyeColor;
		this.heigth = height;
	}
	
	public void walk() {
		System.out.println("I'm walking...");
	}
	
}
