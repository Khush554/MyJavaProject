package com.arraytest1;

import com.interfacepackage.A;

public class Uniquech {
	public static void check(char ch[]) {


		int min=Integer.MAX_VALUE;
		char c=' ';
		for(int i=0;i<ch.length;i++) {
			boolean isvisited=false;
			int count=1;
			for(int k=i-1;k>=0;k--) {
				if(ch[i]==ch[k]) {
					isvisited=true;
					break;
					
				}
			}
			if(isvisited==false) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
					}
				}
			
			if(count<min) {
				min=count;
				c=ch[i];
			}}
			
		}
		System.out.println(min+" "+c);
		
		
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char c[]= {'a','b','d','a'};
      Uniquech.check(c);
	}

}
