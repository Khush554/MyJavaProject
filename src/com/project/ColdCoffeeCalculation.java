package com.project;

import java.util.Scanner;

public class ColdCoffeeCalculation extends CoffeeCold {
    public void coldCoffee() {
	 System.out.println("Showing Types...");
   	 
   	 System.out.println("1.Black Coffee \n2.Decaf \n3.Espresso \n4.Irish Coffee");
   	 System.out.println("Enter number of coffee"); 
   	 Scanner sc=new Scanner(System.in);
   	 numofcoffee=sc.nextInt();
   	
   	 switch(numofcoffee) {
   	 case 1:total_amount=240;
   	 break;
   	 case 2:total_amount=290;
   	 break;
   	 case 3:total_amount=360;
   	 break;
   	 case 4:total_amount=570;
   	 break;
   	 }
   	 System.out.println("Amount is"+total_amount);
   	 System.out.println("Please Enter the Quantity");
   	 item_quantity=sc.nextInt();
    }
}