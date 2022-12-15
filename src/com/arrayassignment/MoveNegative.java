package com.arrayassignment;

import java.util.Arrays;

public class MoveNegative {
	public static void check(int a[]) {
		int i=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]<0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void check1(int a[]) {
		int i=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]>0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void check3(int b[]) {
		int i=0;
		for(int j=0;j<b.length;j++) {
			if(b[j]%2==0) {
				int temp=b[j];
				b[j]=b[i];
				b[i]=temp;
				i++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={-1,2,-3,4};
		int b[]= {1,2,3,4};
		MoveNegative.check(a);
		MoveNegative.check1(a);
		MoveNegative.check3(b);

	}

}
