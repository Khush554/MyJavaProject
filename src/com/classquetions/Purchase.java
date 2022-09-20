package com.classquetions;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of item");
		int purchase=sc.nextInt();
		int price=0;
		//System.out.println("Enter number of item");
		String itemname=" ";
		
		int quantity=0;
		for(int i=1;i<=purchase;i++) {
			System.out.println("Enter item name");
			itemname=sc.next();
			System.out.println("Enter item price");
			price=sc.nextInt();
			//price=price+price;
			quantity++;
		
		}
		if(quantity>0) {
			price=price+price;
		}
		else {
			System.out.println("error");
		}
		//System.out.println(price);
		 //System.out.println("quantity="+quantity);

	}

}
