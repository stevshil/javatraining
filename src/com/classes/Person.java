package com.classes;

public class Person {
	public static void main(String[] args) {
		System.out.println("Person Class");
		PersonY steve = new PersonY();
		steve.name="Steve";
		steve.age=42;
		steve.weight=(double)1;
		steve.print();
		steve.birthday();
		steve.print();
	}
}

class PersonY {
	String name;
	Integer age;
	String eyeColor;
	double height;
	double weight;
	
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