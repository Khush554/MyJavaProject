package com.arraytest1;

import java.util.Arrays;

public class PerfectSq {
	public static void perfectsq(int ar[]) {
		    int pos=0;
		    int sq1[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
		    int number=ar[i];
		    int sq= number*number;
		   
		    for(int j=1;j<=sq;j++) {
		    	
		    	if(number%j==0&&number/j==j) {
		    		sq1[pos]=number;
		    		System.out.println(number);
		    		pos++;
		    	}
		    	
		    }
		    
		 
		}
		System.out.println(Arrays.toString(sq1));
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		PerfectSq.perfectsq(a);
		int num=22;
		for(int i=1;i*i<=num;i++) {
			if(num%i==0&&num/i==i) {
				System.out.println(i);
			
		}
			
			}
		

	}

}
