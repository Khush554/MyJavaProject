package com.arrayassignment;

import java.util.Arrays;

public class MergeTwoNoDuplicate {
	public static void check(int a[],int b[],int temp[],int pos) {
		
		
		for(int i=0;i<a.length;i++) {
			temp[pos]=a[i];
			pos++;
		}
		for(int i=0;i<b.length;i++) {
			temp[pos]=b[i];
			pos++;
		}
		//remove duplicate
		for(int i=0;i<temp.length;i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(temp[i]==temp[j]) {
					break;
				}
			}
			if(i==j) {
				System.out.print(temp[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]= {12,34,4,2,33,4};
		int temp[]=new int[a.length+b.length];
		int pos=0;
		MergeTwoNoDuplicate.check(a,b,temp,pos);

	}

}
