package com.animalKingdom.fish;

public class Eel extends FIsh {
	
	protected String feature;
	
	public Eel() {
		super();
		this.feature = "Release Electric Shock";
	}

	@Override
	public String ShowInfo() {
		return "Eel [feature=" + feature + ", livesOnWater=" + livesOnWater + ", gills=" + gills + ", heightInFeet="
				+ heightInFeet + ", InKilo=" + InKilo + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
