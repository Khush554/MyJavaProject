package com.array26;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float a[]=new float[5];
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter float number");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextFloat();
		}
		System.out.println("Output...............");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Output...............");
		for(float a1:a) {
			System.out.println(a1);
		}
		System.out.println("Output...............");
		System.out.println(Arrays.toString(a));
		
		
		
		

	}

}
