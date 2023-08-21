package com.basic666;
import java.util.Scanner;
public class Perfect {
	 boolean  IsPerfect(int num){
		
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		Perfect p=new perfect();
		boolean b=IsPerfect(num);
if(b) {
	System.out.println("the number is perfect number");
}
else {
	System.out.println("the number is not perfect number");
}
	}

}
