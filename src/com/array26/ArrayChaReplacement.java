package com.array26;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChaReplacement {

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
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]+(char)(1));
			char r=(char)((2)+a[i]);
			System.out.println(r);
			
		}

	}

}
