package com.ooptest;

import java.util.Scanner;

public class NegativePositiveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("positive");
			
		}
		else if(n<0) {
			System.out.println("negative");
			
		}
		else if(n==0) {
			System.out.println("zero");
		}

	}

}
