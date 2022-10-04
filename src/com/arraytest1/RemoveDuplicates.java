package com.arraytest1;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void removed(int a[]) {
		int newa[]=new int[a.length];
		int pos=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]!=a[j]) {
					newa[pos]=a[i];
					pos++;
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(newa));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4, 3, 2, 4, 9, 2};
		RemoveDuplicates.removed(arr);

	}

}
