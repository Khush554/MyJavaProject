package com.c14;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
	
	   if(isPrime==true) {
			System.out.println(n);
		}
	   else {
		   System.out.println("Not Prime");
	   }

	}

}
