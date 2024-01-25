package com.classes;

public class Person2 {
	public static void main(String[] args) {
		System.out.println("Person 2 Class");
		System.out.printf("Class People: %d\n", PersonX.getClassPeople());
		PersonX steve = new PersonX("Steve",42);
		// steve.age=22; // Error as properties are private
		steve.print();
		steve.birthday();
		steve.print();
		PersonX john = new PersonX("John",22); // Setting the Class member counter to 2
		PersonX bob = new PersonX("Bob",25,"Blue",2.1,102);
		bob.print();
		System.out.printf("Class People: %d\n", PersonX.getClassPeople());
		System.out.printf("Instance People: %d\n", steve.getInstancePeople());
		System.out.printf("Instance People: %d\n", john.getInstancePeople());
	}
}

class PersonX {
	private String name;
	private Integer age;
	private String eyeColor;
	private double height;
	private double weight;
	private static Integer numberOfPeople=0;
	private Integer peopleInstanceCount=0;
	
	public static Integer getClassPeople() {
		return numberOfPeople;
	}
	
	public Integer getInstancePeople() {
		return peopleInstanceCount;
	}
	
	public PersonX(String nameIn, Integer ageIn) {
		name=nameIn;
		age=ageIn;
		numberOfPeople++;
		peopleInstanceCount++;
		Integer id = peopleInstanceCount;
	}
	
	public PersonX(String name, Integer age, String eyeColorIn, double heightIn, double weightIn) {
		// Override constructor and we can call the 2 attribute constructor to set name and age
		this(name, age);
		eyeColor = eyeColorIn;
		height = heightIn;
		weight = weightIn;
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