package com.arraytest1;

import java.util.Arrays;

public class ReplaceWithZero {
	public static void replace(int ar[],int n) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				ar[i]=1;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		int n=0;
		ReplaceWithZero.replace(a,n);



	}

}
