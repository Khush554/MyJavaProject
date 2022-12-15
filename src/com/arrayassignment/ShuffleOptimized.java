package com.arrayassignment;

import java.util.Arrays;

public class ShuffleOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,6,23,67,39,10,2};
		int p=1;
		int d=1;
		
		while(p<=d) {
			int end=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=end;
			p++;
		}
		System.out.println(Arrays.toString(a));
    
	}

}
