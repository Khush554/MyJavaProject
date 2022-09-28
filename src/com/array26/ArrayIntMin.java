package com.array26;

import java.util.Scanner;

public class ArrayIntMin {
	public static void minint(int ar[]) {
		//int min=ar[0];
		int min=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n[]=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		ArrayIntMin.minint(n);
		

	}

}
