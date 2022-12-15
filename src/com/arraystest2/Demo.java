package com.arraystest2;

import java.util.Arrays;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,-4,-1,4,-5};
	      int i=0;
	     int c=0;
	      for(int j=0;j<a.length;j++) {
	    	  if(a[j]<0) {
	    		  int temp=a[j];
	    		  a[j]=a[i];
	    		  a[i]=temp;
	    		  i++;
	    		  c++;
	    	  }
	    	  
	      } 
	      System.out.println(Arrays.toString(a));
	      //System.out.println(count);
	      
	      for(int j=0;j<a.length-1;j++) {
	    	  if(a[j]>0) {
	    		  if(a[j]>a[j+1]) {
	    			  int temp=a[j+1];
	    			  a[j+1]=a[j];
	    			  a[j]=temp;
	    		  }
	    	  }
	    	  
	      }
	    //  System.out.println(Arrays.toString(a));
	     
	      for(int k=0;k<a.length-1;k++) {
//	    	  if(a[k]<0 && a[k+1]<0) {
//	    		  continue;
//	    	  }
	    	//  int c1=0;
	    	   String s="jj";
	    		  if(a[k]<0 && a[k+1]>0) {
	    			  int temp=a[k];
	    			  a[k]=a[k+1];
	    			  a[k+1]=temp;
	    			  k++;
	    			 // break;


	    		  }
	    		 
	    		  }
	    	  
	    	 
	      
	      System.out.println(Arrays.toString(a));
	     

	}

}
