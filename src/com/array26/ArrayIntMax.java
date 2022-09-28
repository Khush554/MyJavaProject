package com.array26;

import java.util.Scanner;



public class ArrayIntMax {
	public static void maxint(int ar[]) {
		int max=ar[0];
		//int max=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n[]=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		ArrayIntMax.maxint(n);
		
		
		
		

	}

}
