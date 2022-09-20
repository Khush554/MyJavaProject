package com.ooptest;

import java.util.Scanner;

//9.	A salesmen is given commission on the basis of sales he makes .
//He gets a commission of 5% only if sales made by him is above 2000.
//WAP to accept sales amount and calculate the commission he gets.
public class Commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc=new Scanner(System.in);
      double salesamount=sc.nextDouble();
      double commission;
      if(salesamount>2000) {
    	 commission=(5*salesamount)/100;
    	 System.out.println(commission);
      }
      else {
    	  System.out.println("salesamount is low");
      }
	}

}
