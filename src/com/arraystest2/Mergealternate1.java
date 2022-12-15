package com.arraystest2;

import java.util.Arrays;

public class Mergealternate1 {
	public static void check(int a[],int b[],int temp[],int p ,int l1,int l2) {
		int i=0;int j=0;
	    while(i<l1&&j<l2) {
	    	temp[p++]=a[i];
	    //	p++;
	    	temp[p++]=b[j];//p++;
	    	i++;j++;
	    }
	    while(i<l1) {
	    	temp[p++]=a[i];
	    	i++;
	    }
	    while(j<l2) {
	    	temp[p++]=b[j];
	    	j++;
	    }
	    

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {11,22,33,44};
		int temp[]=new int[a.length+b.length];
		int l1=a.length;
		int l2=b.length;
		
		int pos=0;
		Mergealternate1.check(a,b,temp,pos,l1,l2);

	}

}
