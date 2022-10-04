package com.loop2test;

import java.util.Scanner;

public class Sumodd {
	public void sum(int n) {
		
		int sum=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2!=0) {
				sum=sum+rem;
				
			}
			n=n/10;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Sumodd s=new Sumodd();
		s.sum(num);
		

	}

}
