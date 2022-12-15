package com.arrayassignment;

import java.util.Arrays;

public class CopyByIterating {
	public static void check(int a[],int c[]) {
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int d[]=a;
		System.out.println(Arrays.toString(d));
		int c[]=new int[a.length];
		CopyByIterating.check(a, c);

	}

}
