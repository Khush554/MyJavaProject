package com.TwoDArray;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a chr");
		a=sc.next().charAt(0);
		if(a>='a'&& a<='z') {
			System.out.println("lower case");
			
		}
		else if(a>='A'&& a<='Z') {
			System.out.println("uppercase");
		}
		

	}

}
