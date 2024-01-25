package com.classes;

public class SuperPeople extends PersonS {
	private String power;
	private String weakness;
	private String publisher;
	
	public SuperPeople(String name, Integer age, String power) {
		super(name,age);
		this.power = power;
	}
	
	public SuperPeople(String name, Integer age, String power, String weakness, String publisher) {
		super(name,age);
		this.power = power;
		this.weakness = weakness;
		this.publisher = publisher;
	}
	
	@Override	// Added to check super class has a print or fail at compile
	public void print() {
		// Don't re-write
//		System.out.printf("Name: %s\n",name);
//		System.out.printf("Age: %d\n", age);
//		System.out.printf("Weight: %f\n", weight);
		super.print();  // Re-use
		System.out.printf("Power: %s\n", power);
	}
}

class PersonS {
	String name;
	Integer age;
	String eyeColor;
	double height;
	double weight;
	
	public PersonS(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.printf("Name: %s\n",name);
		System.out.printf("Age: %d\n", age);
		System.out.printf("Weight: %f\n", weight);
	}
	
	public void birthday() {
		age++;
		addWeight();
	}
	
	private void addWeight() {
		weight+=2.0;
	}
}