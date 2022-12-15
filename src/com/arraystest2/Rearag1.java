package com.arraystest2;

import java.util.Arrays;

public class Rearag1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,3,-4,-1,4};
      int i=0;
      int count=0;
      for(int j=0;j<a.length;j++) {
    	  if(a[j]<0) {
    		  int temp=a[j];
    		  a[j]=a[i];
    		  a[i]=temp;
    		  i++;
    		  count++;
    	  }
    	  
      } 
     // System.out.println(Arrays.toString(a));
      //System.out.println(count);
      int count1=count;
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
     
      for(int h=0;h<a.length;h++) {
    	 if(a[h]>0) {
    	  int c=count1;
    		 for(int m=1;m<a.length;) {
    			 if(c>=count1) {
    		    	if(a[m]<0) {
    		    	    int temp=a[m];
    		    	    a[m]=a[h];
    		    		a[h]=temp;
    		    		break;
   		    		
    	 }break;
    		    	}
      }
     
   
      }
     // System.out.println(Arrays.toString(a));
      }
      System.out.println(Arrays.toString(a));
	}}
	
