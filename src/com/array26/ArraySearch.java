package com.array26;

import java.util.Scanner;

import com.interfacepackage.A;


public class ArraySearch {
	public static boolean ispresent(int n,int ar[]) {
		boolean ispresent=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n) {
				ispresent=true;
				break;
			}
		}
		
		return ispresent;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some numbers");
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter search number");
		int n=sc.nextInt();
		boolean ispresent=ArraySearch.ispresent(n,a);
		if(ispresent) {
			System.out.print("yes");
		}
		else {
			System.out.print("not");
		}
			
			
		}
		
		
		
	}
	


