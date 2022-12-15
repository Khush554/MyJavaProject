package com.array26;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,1,3,4,7};
		int n=3;
		int ans[]=new int[2*n];
     	int j=0;
	    for(int i=0;i<2*n;i=i+2) {
		 ans[i]=a[i];
		 ans[i+1]=a[j+n];
		 j++;
	}
	    System.out.println(Arrays.toString(ans));

	}

}
