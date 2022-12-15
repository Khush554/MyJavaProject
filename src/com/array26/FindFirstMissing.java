package com.array26;

public class FindFirstMissing {
        public static void main(String []args) {
        	int a[]= {2,3,-3,4};
        	for(int i=0;i<a.length;i++) {
        		int element=a[i];
        		if(element>=1 && element <=a.length) {
        			int chair=element-1;
        			if(a[chair]!=element) {
        				int temp=a[chair];
        				a[chair]=element;
        				element=temp;
        				i--;
        			}
        		}
        	}
        	int ar=0;
        	for(int i=0;i<a.length;i++) {
        		if(i+1!=a[i]) {
        			ar=i+1;
        			break;
        		}
        	}
        	 System.out.println(ar);    
        	  
        	}
        	
        	
}

