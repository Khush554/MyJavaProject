package com.AI;
//Write a Java program that takes a year from user and print
//whether that year is a leap year or not.
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2016;
		if(year%400==0||((year%4==0)&&(year!=100))){
			System.out.println("yy");
		}

	}

}
