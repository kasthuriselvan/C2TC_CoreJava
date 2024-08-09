package com.tns.daysix.usingfinal;

public class FinalVariable {
	final int x = 100;
	// Declare a static blank final variable.
	final static int Y;
	// Declare & intialize static final variable.
	final static int Z = 10;
	// instatnce method
	void change() {
    int x = 30; // final variables can't be reassigned
	int Y = 200; // final static variables can't be reassigned
	}
	@Override
	public String toString() {
	return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}
	// Declare a static block to initialize the final static variable.
	static {
	Y = 20;
     // Once intialized can't be reassigned
	System.out.println("Value of Y: " + Y);
	}
	}
	//Program to demonstrate final method 
	//class with final method
	class FinalMethodClass {
	// constructor
	FinalMethodClass() {
	System.out.println("This is a default constructor");
	}
	final int a = 50;
	// Final method
	final void show() {
	System.out.println("Value of a: " + a);
	}
}
