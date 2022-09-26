package com.ooptest1;

import java.util.Scanner;

//Write a program with Shopping class which has overloaded method
//‘doTransaction’. If it
//has CreditCard type parameter it should display message ‘You got 15%
//discount on bill on credit card transaction’.
//If it has DebitCard type parameter it should display message ‘No discount
//on bill on debit card transaction’.
class Creditcard{
	
}
class DebitCard{

}
class Shopping1{
	
	
	Creditcard credit;
	DebitCard debit;
	
	
	void doTransaction(Creditcard credit) {
		//this.credit=credit;
		System.out.println("You got 15%\r\n"
				+ "discount on bill on credit card transaction");
		
	}
	void doTransaction(DebitCard debit) {
		//this.debit=debit;
		System.out.println("No discount\r\n"
				+ "on bill on debit card transaction");
		
	}
	
}










public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	
		Shopping1 s=new Shopping1();
		Creditcard c=new Creditcard();
		DebitCard d=new DebitCard();
		
		
	
		s.doTransaction(d);
		

	}

}
