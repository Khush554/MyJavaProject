package com.arraystest2;

import java.util.Arrays;

public class SeparateZero {
	public static void check(int a[]) {
		int i=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 0, 7, 0, 8, 0, 3,0};
		SeparateZero.check(a);

	}

}
