package com.loop2test;

import java.util.Scanner;

public class kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org=num;
		int sq=num*num;
		int a=1;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
		for(int i=1;i<=count;i++) {
			a=10*a;
		}
		System.out.println(a);
		int k=sq%a;
		System.out.println(k);
		int l=sq/a;
		System.out.println(l);
		if((k+l)==org) {
			System.out.println("Kaprekar");
		}
		else {
			System.out.println("not Kaprekar");
		}
		
	}

}
