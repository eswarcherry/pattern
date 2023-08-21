package com.basic666;
class Animal{
	String name;
	void m1() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal{
	String name;
	void m2() {
		System.out.println("my name is" +name);
	}
}

public class SingleMain {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.m1();
		d.m2();

	}

}
