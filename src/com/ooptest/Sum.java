package com.ooptest;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);

	}

}
