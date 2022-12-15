package com.project;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraBeverages {
	static char Question;
	static int price;
	static int itemCount;
	static int choice;
	static int temp[]=new int[4];
	static int pos=0;
	static int totalsnacks=0;
	
	public static void snacks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("You want some snacks with coffee?? Enter Y and N..");
		Question=sc.next().charAt(0);
		if(Question=='y'||Question =='Y') {
		System.out.println("How many items");
		itemCount=sc.nextInt();}
		System.out.println("Enter snacks..Nos..\n1.Spinach, Feta & Egg White Wrap Turkey Bacon\n2. Cheddar & Egg White Sandwich\n3. Hearty Blueberry Oatmeal\n 4.Grilled Chicken and Hummus Protein Box");
		int i=1;
		if(Question=='y') {
		do {
			
			//Question=sc.next().charAt(0);
			//System.out.println("Enter snacks..Nos..\n1.Spinach, Feta & Egg White Wrap Turkey Bacon\n2. Cheddar & Egg White Sandwich\n3. Hearty Blueberry Oatmeal\n 4.Grilled Chicken and Hummus Protein Box");
			
			 choice=sc.nextInt();
			switch(choice) {
			case 1:price=240;break;
			case 2:price=250;break;
			case 3:price=260;break;
			case 4:price=280;break;
			}
			temp[pos]=price;
			pos++;
			
			i++;
			
		}while(i<=itemCount);}
		if(itemCount>=1) {
		     for(int j=0;j<itemCount;j++) {
		    	 totalsnacks=totalsnacks+temp[j]; 
		    	 System.out.println(totalsnacks);
		      
		     }}
		System.out.println("Your item is......"+choice+"......"  +"price is  "+totalsnacks);
		
	}
	
		
		
	
//	public static void main(String [] args) {
//		 ExtraBeverages.snacks();
//	}
	
	

	

}
