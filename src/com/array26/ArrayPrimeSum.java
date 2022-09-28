package com.array26;

import java.util.Scanner;

import com.interfacepackage.A;

public class ArrayPrimeSum {
	public static int sumPrime(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			boolean isprime=true;
			for(int j=2;j<i;j++) {
				if(ar[i]%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime==true&& ar[i]!=1) {
				System.out.println(ar[i]);
				sum=sum+ar[i];
			}
		}
		return sum;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		ArrayPrimeSum.sumPrime(a);
		System.out.println(ArrayPrimeSum.sumPrime(a));

	}

}
