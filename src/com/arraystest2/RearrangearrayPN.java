package com.arraystest2;

import java.util.Arrays;

public class RearrangearrayPN {
	public static void check(int a[],int temp[]) {
		int p=0;
		int count=0;
		int t[]=new int[a.length+temp.length];
		int pt=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				temp[p++]=a[i];
				//count++;
			}
		}
		System.out.println(Arrays.toString(temp));
			  
				int k=0;
				int l=0;
				int l1=a.length;
				int l2=temp.length;
				while(k<l1 &&l<l2) {
					
					t[pt++]=temp[l++];
					t[pt++]=a[k++];
				}
				while(k<l1) {
					t[pt++]=a[k++];
				}
				while(l<l2) {
					t[pt++]=temp[l++];
				}
				
				
				
		for(int i=0;i<t.length;i++) {
			
				int j=0;
				for(j=0;j<i;j++) {
					if(t[i]==t[j]) {
						break;
					}
					
					}
				if(i==j) {
					if(t[i]!=0) {
						System.out.print(t[i]+" ");
					}
				}
			}
		}	
	
		
		//System.out.println(Arrays.toString(t));

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, -4, -1, 4};
		int temp[]=new int[a.length];
		RearrangearrayPN.check(a,temp);

	}

}
