package com.c15;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int t=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			//System.out.println(sum);
			num=num/10;
			
		}
		for(int i=1;i<=7;i++) {
			t=t+i;
		}
		int m=t-sum;
		System.out.println(m);
}}