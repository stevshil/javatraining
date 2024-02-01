package com.simpleclasses;

public class Dog {
	
	private String name;
	private String breed;
	private float weight;
	private String color;
	
	public Dog(String name) {
		this.name = name;
	}
	
	// Override Dog constructor
	public Dog(String name, String breed, String colour) {
		this.name = name;
		this.breed = breed;
		color = colour;
	}
	
	// Setter
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public float getWeight() {
		return weight;
	}
	
	// Methods
	public void eatFood() {
		weight+=0.5;
	}
}