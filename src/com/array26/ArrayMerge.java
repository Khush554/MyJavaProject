package com.array26;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
	public static void merge(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++) {
			c[k]=b[i];
			k++;
		}
		System.out.println(Arrays.toString(c));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some number");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter some number");
		int b[]=new int[5];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		ArrayMerge.merge(a, b);
		

	}

}
