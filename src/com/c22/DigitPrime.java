package com.c22;

import java.util.Scanner;

public class DigitPrime {
	public void showprime(int num) {
		
		int rem;
		while(num>0) {
			rem=num%10;
			//System.out.println(rem);
			boolean isprime=true;
			for(int i=2;i<rem;i++) {
				if(rem%i==0) {
					isprime=false;
					break;
				}}
			
				 if(isprime==true){
					System.out.println(rem);}
			
			num=num/10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		DigitPrime p=new DigitPrime();
		p.showprime(num);
	}

}
