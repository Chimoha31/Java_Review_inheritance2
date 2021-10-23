package com.animalKingdom;

public class Animal {

	private float heightInFeet;
	private float InKilo;
	private String animalType;
	private String bloodType;
	
//	defaultのconstructor
	public Animal() {
		this.heightInFeet = 0;
		this.InKilo = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
		
	}

	@Override
	public String showInfo() {
		return "Animal [heightInFeet=" + heightInFeet + ", InKilo=" + InKilo + ", animalType=" + animalType
				+ ", bloodType=" + bloodType + "]";
	}
	
}
