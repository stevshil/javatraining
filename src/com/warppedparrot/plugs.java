package com.warppedparrot;

public class plugs {
	public static void main(String[] args) {
		Dog Dave;
		Dave = new Dog();
		System.out.println(Dave.getState());
		System.out.println(Dave.scratch());
		System.out.println(Dave.sleep());
		Dave.move();
		System.out.println(Dave.getState());
	}
}

class Dog implements Manimal {
	private int weight;
	private String state;
	private String lastMeal;
	
	public Dog() {
		this.state="Sitting";
		this.weight=0;
	}
	
	public void eat(String toEat) {
		lastMeal=toEat;
		weight+=1;
	}
	
	public void move() {
		if ( state == "moving" ) {
			state="stopped";
		} else {
			state = "moving";
		}
	}
	
	public String scratch() {
		if ( state == "sleeping" ) {
			return "ZZZZZZZZ";
		} else {
			return "Ah, that's better";
		}
	}
	
	public String getState() {
		return state;
	}
}

class Fish implements Manimal {
	private double weight;
	private String state;
	
	public Fish() {
		this.state="Swimming";
		this.weight=0;
	}
	
	public void eat(String toEat) {
		weight+=0.1;
	}
	
	public void move() {
		if ( state != "swimming" ) {
			state="swimming";
		} else {
			state="floating";
		}
	}
	
	public String scratch() {
		return "Fish don't scratch, silly";
	}
	
	public String getState() {
		return state;
	}
}