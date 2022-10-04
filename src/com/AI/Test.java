package com.AI;
//Write a Java program that reads in two floating-point numbers 
//and tests whether they are 
//the same up to three decimal places. 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=23.456f;
		float b=23.4563f;
		double ans=a*1000;
		ans=ans/1000;
		double ans1=b*1000;
		ans1=ans1/1000;
		if(ans==ans1) {
			System.out.println("same");
		}
		else {
			System.out.println("Different");
		}
		
		

	}

}
