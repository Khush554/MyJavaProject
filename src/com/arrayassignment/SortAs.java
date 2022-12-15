package com.arrayassignment;

import java.util.Arrays;

public class SortAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,21,3,5,34,6,3,};
		for(int i=0;i<a.length;i++) {
			//boolean isw=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					//isw=true;
				}
			}
//			if(isw==false) {
//				
//				break;
//			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
