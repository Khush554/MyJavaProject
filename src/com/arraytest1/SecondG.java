package com.arraytest1;

public class SecondG {
	public static void check(int a[]) {
		int maxf=a[0],maxs=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>maxf) {
				maxs=maxf;
				maxf=a[i];
			}
			
		}
		System.out.println(maxs);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,33,45,2};
		SecondG.check(a);

	}

}
