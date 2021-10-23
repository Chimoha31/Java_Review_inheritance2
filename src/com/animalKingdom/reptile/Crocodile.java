package com.animalKingdom.reptile;

public class Crocodile extends Reptile{
	
	public Crocodile() {
		super();
		eggType = "Hard Shelled";
	}

	@Override
	public String ShowInfo() {
		return "Crocodile [skinType=" + skinType + ", eggType=" + eggType + ", backBone=" + backBone + ", heightInFeet="
				+ heightInFeet + ", InKilo=" + InKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

	
}
