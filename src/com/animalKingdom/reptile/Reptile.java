package com.animalKingdom.reptile;
import com.animalKingdom.Animal;

public class Reptile extends Animal{
	
	protected String skinType, eggType;
	protected boolean backBone;
	
	public Reptile() {
		heightInFeet = 5f;
		InKilo = 20f;
		animalType = "Reptile";
		bloodType = "cold";
		this.skinType = "Dry Skin";
		this.eggType = "Soft Shelled";
		this.backBone = true;
	}

	public String ShowInfo() {
		return "Reptile [skinType=" + skinType + ", eggType=" + eggType + ", backBone=" + backBone + ", heightInFeet="
				+ heightInFeet + ", InKilo=" + InKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
	

}
