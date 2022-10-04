package com.arraytest1;

import java.util.Arrays;

public class MoveZero {
	public static void movezero(int ar[]) {
		int i=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]!=0) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					i++;
					
				}
			}
			System.out.println(Arrays.toString(ar));
		}
	public static void movezero1(int ar[]) {
		int i=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]==0) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					i++;
					
				}
			}
			System.out.println(Arrays.toString(ar));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 0, 7, 0, 8, 0, 3};
		MoveZero.movezero(a);
		MoveZero.movezero1(a);

	}

}
