package com.qa.main;

public class Wolf extends Animal {

	private String colourOfFur;

	public Wolf(String colourOfFur) {
		super(4, "Canis", true);
		this.setColourOfFur(colourOfFur);
	}

	public String getColourOfFur() {
		return colourOfFur;
	}

	public void goodBoy() {
		System.out.println("a very good boy.");
	}

	@Override
	public void makeNoise() {
		System.out.println("ANGRY WOOF");
	}

	@Override
	public void move() {
		System.out.println("runs");
	}

	public void setColourOfFur(String colourOfFur) {
		this.colourOfFur = colourOfFur;
	}
}
