package com.arrayassignment;

import java.util.Arrays;

public class ReplaceNegativewithImediate {
	public static void check(int a[]) {
		int temp[]=new int[a.length];
		int pos=0;
		for(int i=0;i<a.length;i++) {
			int currentvalue=a[i];
			if(a[i]<0) {
				temp[i]=a[i-1]*a[i-1];
				pos++;
			}
			else if(a[i]>=0) {
				temp[i]=a[i];
				pos++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 3,-19, 29, 5, -61, 44, 7, -9};
		ReplaceNegativewithImediate.check(a);


	}

}
