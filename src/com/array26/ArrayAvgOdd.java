package com.array26;

import java.util.Scanner;

public class ArrayAvgOdd {
	static int odd(int arr[]) {
		int avg=0,sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
				count++;
			}
		}
		System.out.println(sum);
		avg=sum/count;
		return avg;
	}

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
		int r=new ArrayAvgOdd().odd(a);
		System.out.println(r);

	}

}
