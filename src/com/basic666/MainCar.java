package com.basic666;
class car{
	
	void m1() {
		String carName="maruthi";
		int carnum=123;
		System.out.println("the name of the car is:" +carName);
		System.out.println(" car number  is:" +carName);
		
	}
}
class maruthi extends car{
	void m2() {
		System.out.println("brand is maruthi");
	}
}
class Maruthi860 extends maruthi{
	void m3(String carbrand,Double carmoney) {
		System.out.println("the car brand is"+carbrand+"the car money is"+carmoney );
		
	}
}

public class MainCar {

	public static void main(String[] args) {
		Maruthi860 m=new Maruthi860();
		m.m1();
		m.m2();
		m.m3("rolex",2000.0);

	}

}
