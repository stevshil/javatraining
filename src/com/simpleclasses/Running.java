package com.simpleclasses;

public class Running {
	
	public static void main(String[] args) {
		
		Dog fido = new Dog("Fido");
		Dog eric = new Dog("Eric","Dalmation","Black and White");
		
		fido.eatFood();
		fido.eatFood();
		System.out.println(fido.getWeight());
		fido.setBreed("Irish Wolf Hound");
		
		System.out.println(eric.getColor());
	}

}
