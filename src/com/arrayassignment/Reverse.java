package com.arrayassignment;

import java.util.Arrays;

public class Reverse {
	public static void check(int a[]) {
		int first=0;
		int second=a.length-1;
		while(first<second) {
			int temp=a[first];
			a[first]=a[second];
			a[second]=temp;
			first++;
			second--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5}; 
		//Reverse.check(a);
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
