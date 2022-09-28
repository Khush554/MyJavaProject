package com.array26;

import java.util.Scanner;

public class ArrayAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght");
		int lenght=sc.nextInt();
		int a[]=new int[lenght];
		System.out.println("Enter value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}

	}

}
