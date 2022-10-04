package com.Assignment1;

public class MinimumFrequency {
	public static void frequency(char ar[]) {
		for(int i=0;i<ar.length;i++) {
			int count=1;
			
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--) {
				if(ar[i]==ar[k]) {
					isvisited=true;
					break;
				}
			}
			if(isvisited==false) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					
					}
				
				}
				
			
			System.out.println(ar[i]+""+count);
		}}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]={'a','b','b','c','b','c'};
		MinimumFrequency.frequency(arr);
		

	}

}
