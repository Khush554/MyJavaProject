package com.arraystest2;

import java.util.Arrays;

public class RevTwoDArray {
	public static void check(int a[][]) {
		int r=2;
		int c=4;
		for(int i=0;i<r;i++) {
			    int s=0;
				int e=c-1;
				//System.out.println(e);
		        while(s<e) {
		        	int temp=a[i][s];
		        	a[i][s]=a[i][e];
		        	a[i][e]=temp;
		        	s++;
		        	e--;
		        	
		        	
		        }}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},{5,6,7,8}};
		RevTwoDArray.check(a);

	}

}
