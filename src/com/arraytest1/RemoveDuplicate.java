package com.arraytest1;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void removed(int ar[]) {
		int temp[]=new int[ar.length];
		int j=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				temp[j]=ar[i];
				j++;
			}
		
		}
		temp[j]=ar[ar.length-1];
		
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,3,4,5};
		RemoveDuplicate.removed(a);

	}

}
