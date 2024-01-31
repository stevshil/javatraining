package com.warppedparrot;

public interface Manimal {
	public void eat(String toEat);
	public void move();
	public String scratch();
	
	default public String sleep() {
		return "Sleeping";
	}
}