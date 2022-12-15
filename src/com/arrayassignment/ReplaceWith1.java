package com.arrayassignment;

import java.util.Arrays;

public abstract class ReplaceWith1 {
	public static void check(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		ReplaceWith1.check(a);

	}

}
