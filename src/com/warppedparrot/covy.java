package com.warppedparrot;

// Covariant example

public class covy {
	public static void main(String[] args) {
		Car MyCar = new Ferrari();
		MyCar.get();
		
		Car BaseCar = new Car();
		BaseCar.get();
	}
}

class Car {
	Car get() {
		System.out.println("This is a Car class");
		return this;
	}
}

class Ferrari extends Car {
	@Override
	Ferrari get() {
		System.out.println("This is a Ferrari");
		return this;
	}
}