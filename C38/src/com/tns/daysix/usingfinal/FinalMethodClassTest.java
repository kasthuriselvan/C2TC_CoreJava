package com.tns.daysix.usingfinal;

public class FinalMethodClassTest extends FinalMethodClass {
	// Compile time error because we cannot override the final method
	/*
	 * @Override void show() {
	 * 
	 * System.out.println("This is the final method of FinalMethodEx class"); }
	 */
}

// Program to demonstrate final class
class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

// can't create child classes from Final class, Ex: String, WrappeClasses,
// System, Scanner, Number are Final classes
class FinalChildClass extends FinalClass {
}
