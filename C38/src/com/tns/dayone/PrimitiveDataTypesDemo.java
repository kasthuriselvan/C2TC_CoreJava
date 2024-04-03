package com.tns.dayone;

public class PrimitiveDataTypesDemo {
public static void main(String[] args) {
	byte byteMax = 127;
	byte bytemin = -128;
	System.out.println("Min range of byte is "+bytemin+" Max range of byte is "+byteMax);
	short shortMax = 32767;
	short shortMin =-32768;
	System.out.println("Minshort range of byte is  "+shortMin+" Maxshort range of byte is "+shortMax);
	int maxInt = 2147483647;
	int minInt = -2147483647;
	System.out.println("Minint range of byte is "+minInt+ " MaxInt range of byte is  "+maxInt);
	long maxLong = 9223372036854775807L;
	long minLong = -9223372036854775808L;
	System.out.println("MinLong range of byte is "+minLong+" MaxLong range of byte is "+maxLong);
	float f=3234.141243278345f;
	double d=3456.14124512345678902345678914f;
	System.out.println("float value "+f+" double value is "+d);
	boolean flag=false;
	System.out.println("boolean value is " +flag);
}
}
