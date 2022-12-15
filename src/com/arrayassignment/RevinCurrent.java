package com.arrayassignment;

import java.util.Arrays;

public class RevinCurrent {
	public static void check(int a[]) {
       int i=0;
       int j=a.length-1;
       while(i<j) {
    	   int temp=a[i];
    	   a[i]=a[j];
    	   a[j]=temp;
    	   i++;
    	   j--;
       }
       System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {3, 90, 45, 29, 37, 78};
      RevinCurrent.check(a);
	}

}
