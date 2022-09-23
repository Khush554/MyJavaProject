package com.c21;

import java.util.Scanner;

public class SumFirstLastDigit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int copy=num;
		int firstdigit=num%10;
		int seconddigit=0;
		int sum=0;
		int rem;
		while(copy!=0) {
			rem=copy%10;
			
			copy=copy/10;
			
			if((copy%10)==0) {
				seconddigit=rem;
			}
		}	
		sum=firstdigit+seconddigit;
		System.out.println(sum);
		
		

	}

}
