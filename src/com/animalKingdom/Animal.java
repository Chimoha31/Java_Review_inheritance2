package com.animalKingdom;

public class Animal {

	protected float heightInFeet;
	protected float InKilo;
	protected String animalType;
	protected String bloodType;
	
//	defaultのconstructor
	public Animal() {
		this.heightInFeet = 0;
		this.InKilo = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
		
	}

	public String ShowInfo() {
		return "Animal [heightInFeet=" + heightInFeet + ", InKilo=" + InKilo + ", animalType=" + animalType
				+ ", bloodType=" + bloodType + "]";
	}
	
}
