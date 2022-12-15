package com.project;

import java.util.Scanner;

public class CoffeeCold {
	 static char type;
	 static int total_amount=0;
	 static int numofcoffee=0;
  	 static int item_quantity=0;
	 public char getType() {
		 return type;
	 }
	 public void setType(char type) {
		 this.type=type;
	 }
//	 public int getTotal() {
//		 return total_amount;
//	 }
//	 public void settotal(int total_amount) {
//		 this.total_amount= total_amount;
//	 }
     public void show_message() {
    	 System.out.println("Welcome To TQCoffee Center");
     }
     public void show_coffee_type() {
    	 System.out.println("Which Type of Coffee You Want To Order");
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("1.Hot Coffee \n 2.Cold Cofee");
    	
     }
       public void show_hotcoffee_types() {
    	 System.out.println("Showing Types...");
    	 
    	 System.out.println("1.Cappuccinos \n2.Espresso Shots \n3.Flat White \n4.Latte Mochas");
    	 System.out.println("Enter number of coffee"); 
    	 Scanner sc=new Scanner(System.in);
    	 numofcoffee=sc.nextInt();
    	
    	 switch(numofcoffee) {
    	 case 1:total_amount=230;
    	 break;
    	 case 2:total_amount=250;
    	 break;
    	 case 3:total_amount=260;
    	 break;
    	 case 4:total_amount=270;
    	 break;
    	 }
    	 System.out.println("Amount is"+total_amount);
    	 System.out.println("Please Enter the Quantity");
    	 item_quantity=sc.nextInt();
     }
     
	

}
