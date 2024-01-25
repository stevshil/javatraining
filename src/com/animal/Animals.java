package com.animal;

public class Animals {
	public static void main(String[] args) {
		Cat cat = new Cat(false, "milk", 4, "black");
		Animal newOne = new Animal(true, "bats", 0);

		System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
		System.out.println("Cat eats " + cat.getEats());
		System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
		System.out.println("Cat color is " + cat.getColor());
		
		System.out.println(cat.toString());
	}
}
