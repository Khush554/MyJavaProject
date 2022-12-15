package com.arraytest1;

public class Uniq {
	public static void check(char a[]) {
		for(int i=0;i<a.length;i++) {
			boolean isvisited=false;
			int count=1;
			for(int k=i-1;k>=0;k--) {
				if(a[i]==a[k]) {
					isvisited=true;
					break;
					
				}
			}
			if(isvisited==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				if(count==1) {
					System.out.println(count+" "+a[i]);
				}
		}
			
				
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char c[]= {'a','b','d','a'};
	      Uniq.check(c);
	}

}
