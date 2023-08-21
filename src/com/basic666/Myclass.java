package com.basic666;
class Employee{
	String name;
	int empid;
	double salary;
	void m1(String name,int empid,double salary) {
	this.name=name;
	this.empid=empid;
	this.salary=salary;
		
		System.out.println("the employee name is"+name);
		System.out.println("the employee name is"+empid);
		System.out.println("the employee name is"+salary);
	}
}
class Manager extends Employee{
	
	void setSalary(){
		
		double ManagerSalary=20000.0;
		System.out.println(""+ManagerSalary);
		
	}
}
class clerk extends Manager{
	int speed;
	int accuracy;
	void setSalary() {
		System.out.println("the speed is"+speed);
		System.out.println("the accuracy is"+accuracy);
	}
}

public class Myclass {

	public static void main(String[] args) {
		clerk c=new clerk();
		c.m1("eswar",20,3000.0);
		

	}

}
