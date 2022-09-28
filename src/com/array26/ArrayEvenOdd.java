package com.array26;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOdd {
	public static void even(int ar[]) {
		int counte=0,counto=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				counte++;
			}
			else {
				counto++;
			}
			
		}
		int even[]=new int[counte-1];
		int odd[]=new int[counto-1];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
				
			}
			else {
				odd[i]=ar[i];
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int a[]=new int[5];
		//int e[]=new int[]
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		ArrayEvenOdd.even(a);

	}

}
