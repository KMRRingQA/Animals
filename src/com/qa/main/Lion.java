package com.qa.main;

public class Lion extends Animal {

	private String colourOfFur;

	public Lion(String colourOfFur) {
		super(4, "Panthera", true);
		this.colourOfFur = colourOfFur;
	}

	public String getColourOfFur() {
		return colourOfFur;
	}

	@Override
	public void makeNoise() {
		System.out.println("RAWR");
	}

	@Override
	public void move() {
		System.out.println("mostly sits around");
	}

	public void setColourOfFur(String colourOfFur) {
		this.colourOfFur = colourOfFur;
	}
}
