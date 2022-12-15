package com.arraystest2;

public class Countfrequency {
	public static void check(int a[]) {
		for(int i=0;i<a.length;i++) {
			boolean isvisited=false;
			int count=1;
			for(int k=i-1;k>=0;k--) {
				if(a[i]==a[k]) {
					isvisited=true;
					break;
				}
			}
			if(!isvisited) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,2,1,3,2,45,5};
		Countfrequency.check(a);

	}

}
