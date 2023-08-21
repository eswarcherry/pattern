package com.basic666;

	

public class Overloading {
	void m1(int x,int y) {
		System.out.println("the addition is " +(x+y));
	}
	void m1(int x,int y,int z) {
		System.out.println("the multiplication is " +(x*y*z));
	}

	

	public static void main(String[] args) {
		Overloading t=new Overloading();
		t.m1(20,30);
		t.m1(2, 3,4);
		
		// TODO Auto-generated method stub

	}

}
