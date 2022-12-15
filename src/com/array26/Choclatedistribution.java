package com.array26;

import java.util.Arrays;

public class Choclatedistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,21,2};
	
	      for(int j=0;j<a.length-1;j++) {
	    	  if(a[j]>0) {
	    		  if(a[j]>a[j+1]) {
	    			  int temp=a[j+1];
	    			  a[j+1]=a[j];
	    			  a[j]=temp;
	    		  }
	    	  }
	    	  
	      }
	     // System.out.println(Arrays.toString(a));
	     
				
				
			
		
		System.out.println(Arrays.toString(a));

	}

}
