package com.ooptest;
//10.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and 
//then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//And any other input of age should print "ERROR".

import java.util.Scanner;

public class ServicePlace {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter gender");
		char gender=sc.next().charAt(0);
		//boolean ismarried=sc.nextBoolean();
		System.out.println("Enter marital status");
		char ismarried=sc.next().charAt(0);
		 if(age>=20 && age<=60) {
			 if(ismarried=='y'||ismarried=='n'||ismarried=='Y'||ismarried=='N') {
				 if( gender=='F'|| gender=='f') {
		               System.out.println("Work only in urban area");
	      	       }
				 else if((gender=='M'||gender=='m')&& (age>=20 && age<=40)) {
			            System.out.println("Work anywhere");
		           }
		          else if((gender=='M'||gender=='m')&& (age>=40 && age<=60)) {
			            System.out.println("Work urban area");
		           }
			 }
		 }
		else {
			System.out.println("Error");
		}
		   }
		}
	


