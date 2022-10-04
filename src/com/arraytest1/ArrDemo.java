package com.arraytest1;

public class ArrDemo {
	public static void showmin(int a[]){
	      int pos=0;
	      int result[]=new int[a.length];
	      
	     for(int i=0;i<a.length;i++){
	     int num1=a[i];

	     for(int j=i+1;j<a.length-1;j++){
	        int num2=a[i+1];
	        result[0]=num1-num2;
	        pos++; 
	  }
	  
	  
	   
	     
	}
	int min=result[0];
	for(int k=1;k<result.length;k++){
	if(min>result[k]){
	    min=result[k];
	}
	

	}
	System.out.println(min+""+result);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,1,3,8,9};
		ArrDemo.showmin(arr);

	}

}
