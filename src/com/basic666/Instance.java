package com.basic666;

public class Instance {
int a=10,b=20;
void m2() {
	System.out.println("the multiplication is"+a*b);
}
static void m1(int a,int b) {
	System.out.println("the addition of a and b is:"+(a+b));
	
}
	public static void main(String[] args) {
		Instance i=new Instance();
		i.m2();
		m1(120,20);

	}

}
