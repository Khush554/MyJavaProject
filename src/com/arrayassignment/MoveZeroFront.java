package com.arrayassignment;

import java.util.Arrays;

public class MoveZeroFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,0,1,0,2};
		int s=0;
		int e=a.length-1;
		while(s<e) {
			if(a[s]>0 && a[e]==0) {
				int temp=a[s];
				a[s]=a[e];
				a[e]=temp;
				s++;
				e--;
			}
			else if(a[s]==0 && a[e]>0) {
				s++;
				e--;
			}
			else if(a[s]==0 && a[e]==0) {
				s++;
			}
			else {
				e--;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
