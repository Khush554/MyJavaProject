package com.loop2test;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=sc.nextInt();
		int rem=0;
		
		int count=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			
			if(digit==rem) {
				count++;}
			
		

	}
		 System.out.println(rem+"="+count);

	}}
