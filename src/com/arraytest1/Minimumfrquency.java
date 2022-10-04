package com.arraytest1;

public class Minimumfrquency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'a','b','c','a'};
		int min=Integer.MIN_VALUE;
		
		int count[]=new int[c.length];
		for(int i=0;i<c.length;i++) {
			boolean isvisited=false;
			char minchar=c[0];
			for(int k=i-1;k>=0;k--) {
				if(c[i]==c[k]) {
					isvisited=true;
					break;
					
				}
			}
			if(!isvisited) {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						count[i]++;
						
					}
					min=count[i];
					if(min>count[i]) {
						min=count[i];
						minchar=(char)count[i];
					}
					System.out.print("c"+" "+minchar);
					
				}
				
				//System.out.print("c"+count[i]+" "+c[i]);

			}
			//System.out.print("c"+count[i]);
			
		}

	}

}
