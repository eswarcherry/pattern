package com.basic666;
class Student{
	int studid;
	String studname;
	double examfee;
	void displayDetails(String studname,double examfee,int studid)
	{
		this.studid=studid;
		this.studname= studname;
		this.examfee=examfee;
		System.out.println("the student id is "+studid);
		System.out.println("the student name is "+studname);
		System.out.println("the student examfee is "+examfee);
		
		
	}
	double payfee(double a)
	{
		return 599999.99; 
	}
}
class Dayscholar extends Student{
	double transportfee;
	
}

public class Runclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
