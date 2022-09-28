package com.array26;

import java.util.Arrays;
import java.util.Scanner;

public class Arraycharrev {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter character");
		char a[]=new char[length];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next().charAt(0);
		}
		//System.out.println(Arrays.toString(a));
		int n=a.length;
		//System.out.println(n);
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}

	}

}
