package com.arrayassignment;

import java.util.Arrays;

public class Shuffle {
	public static void check(int a[]) {
		int av=a[0];
	for(int i=0;i<a.length-1;i++) {
		a[i]=a[i+1];
	}
	for(int i=0;i<a.length;i++) {
		a[a.length-1]=av;
	}
	
	System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,6,23,67,39,10,2};
		Shuffle.check(a);

	}

}
