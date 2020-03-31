package com.qa.main;

public abstract class Animal {

	private int numberOfLegs;
	private String genus;
	private boolean isVertebrate;

	public Animal(int numberOfLegs, String genus, boolean isVertebrate) {
		super();
		this.numberOfLegs = numberOfLegs;
		this.genus = genus;
		this.isVertebrate = isVertebrate;
	}

	public String getAnimalKingdom() {
		return genus;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public boolean isVertebrate() {
		return isVertebrate;
	}

	public void makeNoise() {
		System.out.println("*dies*");
	}

	public void move() {
		System.out.println("shuffling about");
	}

	public void setAnimalKingdom(String genus) {
		this.genus = genus;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public void setVertebrate(boolean isVertebrate) {
		this.isVertebrate = isVertebrate;
	}

}
