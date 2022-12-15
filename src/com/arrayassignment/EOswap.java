package com.arrayassignment;

import java.util.Arrays;

public class EOswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int s=0;
		int e=a.length-1;
		while(s<e) {
			if(a[s]%2==0 && a[e]%2!=0) {
				s++;
				e--;
			}
			else if(a[s]%2!=0 && a[e]%2==0) {
				int temp=a[s];
				a[s]=a[e];
				a[e]=temp;
				s++;
				e--;
			}
			else if(a[s]%2==0 && a[e]%2==0) {
				s++;
			}
			else {
				e--;
			}
		}
		System.out.println(Arrays.toString(a));
		// 
		int i=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]%2==0) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
			
		}
		//System.out.println(Arrays.toString(a));
		for(int k=0;k<a.length;k++)
				{
			System.out.print(a[k]);
				}
	}

}
