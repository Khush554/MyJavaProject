package com.oop7sept;

import java.util.Scanner;

public class Shoping {
	
	 int purchaseItem;
	 int quantity;
	 int totalprice;
	 
	 
	 public void shoppingdetails(int purchaseItem,int quantity,int totalprice) {
		 this.purchaseItem=purchaseItem;
		 this.quantity=quantity;
		 this.totalprice=totalprice;
	 }
	 public void bill() {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of item");
			purchaseItem=sc.nextInt();
		    totalprice=0;
			//System.out.println("Enter number of item");
			String itemname=" ";
			
			quantity=0;
			for(int i=1;i<=purchaseItem;i++) {
				System.out.println("Enter item name");
				itemname=sc.next();
				System.out.println("Enter item price");
				totalprice=sc.nextInt();
				//price=price+price;
				quantity++;
			
			}
			if(quantity>0) {
				totalprice=totalprice+totalprice;
			}
			else {
				System.out.println("error");
			}
		 
	 }
	 public void display(){
		 System.out.println("purchaseItem="+" "+purchaseItem+" "+"quantity="+quantity+" "
				 +"totalprice="+totalprice);
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoping s=new Shoping();
		//s.shoppingdetails(purchaseItem,quantity,totalprice);
		
		s.bill();
		s.display();

	}

}
