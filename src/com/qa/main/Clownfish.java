package com.qa.main;

public class Clownfish extends Animal {

	private String colourOfScales;

	public Clownfish(String colourOfScales) {
		super(0, "Anemonefishes", true);
		this.setColourOfScales(colourOfScales);
	}

	public String getColourOfScales() {
		return colourOfScales;
	}

	@Override
	public void makeNoise() {
		System.out.println("ANGRY WOOF");
	}

	@Override
	public void move() {
		System.out.println("swim swim swim");
	}

	public void setColourOfScales(String colourOfScales) {
		this.colourOfScales = colourOfScales;
	}
}
