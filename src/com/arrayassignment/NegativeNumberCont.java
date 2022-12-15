package com.arrayassignment;

import java.util.Arrays;

public class NegativeNumberCont {
	public static void check(int a[]) {
		int temp[]=new int[a.length];
		int pos=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				temp[pos]=a[i];
				pos++;
				count++;
				
			}
			
		}
		
	for(int i=0;i<temp.length;i++) {
		if(temp[i]<0) {
			System.out.print(temp[i]+" ");
		}
	}
	System.out.print("countis="+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,-2,-3,-4,2,-1};
		NegativeNumberCont.check(a);

	}

}
