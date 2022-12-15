package com.project;

import java.util.Scanner;

public class CoffeeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeCold c=new CoffeeCold();
		ColdCoffeeCalculation c1=new ColdCoffeeCalculation();
		BillCalculate c2=new BillCalculate();
	 
	   c.show_message();
	
    	c.show_coffee_type();
		 System.out.println("Enter cofee....");
		 Scanner sc=new Scanner(System.in);
		///here i m check coffee type//////// 
		 char t=sc.next().charAt(0);
		 if(t=='h'||t=='H') {
		 c.setType(t);
		 System.out.println("your coffee is= Hot coffee");
		 c.show_hotcoffee_types();
		 //c2.billCalculation();
		 // c2.totalcal();
		  
		}
		 else if(t=='c'||t=='C') {
			c.setType(t);
		    System.out.println("your coffee is= Cold coffee");
		    c1.coldCoffee();
		  //  c2.billCalculation();
		   // c2.totalcal();
		   
			
		}
	   else {
			 System.out.println("Enter correct coffee type");
		 } 
		///end of check...//// 
	    ExtraBeverages.snacks();
	    c2.billCalculation();
	    c2.totalcal();
		 
	}

}
