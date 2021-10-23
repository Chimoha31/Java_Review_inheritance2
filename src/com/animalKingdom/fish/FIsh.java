package com.animalKingdom.fish;
import com.animalKingdom.Animal;


public class FIsh extends Animal {

	protected boolean livesOnWater;
	protected boolean gills;
	
	public FIsh() {
		animalType = "Fish";
		this.livesOnWater = true;
		this.gills = true;
	}

	@Override
	public String ShowInfo() {
		return "FIsh [livesOnWater=" + livesOnWater + ", gills=" + gills + ", heightInFeet=" + heightInFeet
				+ ", InKilo=" + InKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
}
