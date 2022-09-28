package com.array26;

import java.util.Scanner;

import com.interfacepackage.A;

public class ArrayEvenSum {
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int lenght=sc.nextInt();
		int a[]=new int[lenght];
		System.out.println("Enter array value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//new ArrayEvenSum().sum(a);
		int result=new ArrayEvenSum().sum(a);
		System.out.println(result);
		
		

	}

}
