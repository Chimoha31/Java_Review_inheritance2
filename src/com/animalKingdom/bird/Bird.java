package com.animalKingdom.bird;
import com.animalKingdom.Animal;

public class Bird extends Animal{
	
	protected boolean feather;
	protected boolean canFly;
	
	
	public Bird() {
		super();
		this.feather = true;
		this.canFly = true;
	}


	public String ShowInfo() {
		return "Bird [feather=" + feather + ", canFly=" + canFly + ", heightInFeet=" + heightInFeet + ", InKilo="
				+ InKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
