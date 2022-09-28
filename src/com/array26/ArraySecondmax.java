package com.array26;

import java.util.Scanner;

import com.interfacepackage.A;

public class ArraySecondmax {
	public static void secondmax(int ar[]) {
		//int max,max2=ar[0];
		int f=ar[0],s=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>f) {
			s=f;
			f=ar[i];
			}
//			else if(ar[i]>s && ar[i]!=f) {
//				s=ar[i];
//			}
			
			}
		
		
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		ArraySecondmax.secondmax(a);
	}

}
