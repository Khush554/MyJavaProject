package com.array26;

import java.util.Arrays;

public class MergeButNotDuplicate {
	public static void check(int a[],int b[])
	{   int temp[]=new int[a.length+b.length];
	   int temp1[]=new int[a.length+b.length];
	    int pos=0;
	    int pos1=0;
		for(int i=0;i<a.length;i++) {
			temp[pos]=a[i];
			pos++;
		}
		//System.out.println(Arrays.toString(temp));
		for(int j=0;j<b.length;j++) {
			temp[pos]=b[j];
			pos++;
		}
		System.out.println(Arrays.toString(temp));
	//	boolean isvisited=false;
		for(int k=0;k<temp.length;k++) {
			boolean isvisited=false;
			for(int l=k-1;l>=0;l--) {
				if(temp[k]==temp[l]) {
					isvisited=true;
					break;
				}
			}
			if(isvisited==false) {
				temp1[pos1]=temp[k];
				pos1++;
			}
			
		}
		for(int x:temp1) {
			System.out.println(x);
		}
		
		//System.out.println(Arrays.toString(temp1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4};
		int b[]= {23,4,6,2};
		MergeButNotDuplicate.check(a,b);

	}

}
