package com.array26;

import java.util.Arrays;

public class Binary {
	public static void check(int a) {
		int bi[]=new int[12];
		int pos=1;
		while(a!=0) {
			bi[pos]=a%2;
			a=a/2;
			pos++;
		}
		int i=1;
//		for(int j=i-1;j>0;j--) {
//			System.out.print(bi[j]);
//		}
		
		System.out.println(Arrays.toString(bi));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int a=1101;
//      int temp=0;
//      int value=1;
//      while(a>0) {
//    	  int rem=a%10;
//    	  temp=temp+rem*value;
//    	  value=value*2;
//    	  a=a/10;
//    	  
//      }
//      System.out.println(temp);
		
		int a=15;
		Binary.check(a);
	}

}
