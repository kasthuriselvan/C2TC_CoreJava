package com.tns.daythree;

public class TaxCalculation {
	public void calculateTax(Person person) {
		if (person.getAge() > 65 || 
		person.getGender().equalsIgnoreCase("female")) {
		person.setTax(0);
		System.out.println("Tax not applicable");
		} 
		else {
		if (person.getIncome() <= 160000) {
		person.setTax(0);
		} else if (person.getIncome() > 160000 && 
		person.getIncome() <= 500000) {
		person.setTax((person.getIncome() - 160000) * 10 / 100);
		} else if (person.getIncome() >= 500000 && 
		person.getIncome() <= 800000) {
		person.setTax((person.getIncome() - 500000) * 20 / 100 + 
		34000);
		} else {
		person.setTax((person.getIncome() - 800000) * 30 / 100 + 
		94000);
		}
		}
		}
}
//Program to define Person entity
public class Person {
//Data members
private String name;
private int income;
private String gender;
private int age;
private int tax;
//Getter and Setters
public int getTax() {
return tax;
}
public void setTax(int tax) {
this.tax = tax;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getIncome() {
return income;
}
public void setIncome(int income) {
this.income = income;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
//Object class method to return string representation of Person object
@Override
public String toString() {
return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax="+tax+"]";
}

}
