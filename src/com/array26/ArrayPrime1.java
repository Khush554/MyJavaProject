package com.array26;

import java.util.Scanner;

import com.interfacepackage.A;

public class ArrayPrime1 {
	public static boolean isprime1(int a) {
		boolean isprime=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				isprime=false;
				break;
			}
		}
		return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some numbers");
		int a1[]=new int[5];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		int sum=0;
		//ArrayPrime1.isprime1(a1);
		for(int i=0;i<a1.length;i++) {
			if(isprime1(a1[i])&&a1[i]!=1) {
				sum=sum+a1[i];
			}
		}
		System.out.println(sum);

	}

}
