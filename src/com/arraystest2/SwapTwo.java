package com.arraystest2;

import java.util.Arrays;

public class SwapTwo {
    public static void check(int a[]) {
    	int i=0;
    	int j=a.length-1;
    	int k=0;
    	while(k<3) {
    		int temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		i++;
    		j--;
    		k++;
    	}
    	System.out.println(Arrays.toString(a));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		SwapTwo.check(a);

	}

}
