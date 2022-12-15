package com.arrayassignment;

public class SecondSmallest {
	public static void check(int a[]) {
//		int f=Integer.MAX_VALUE;
//		int s=Integer.MAX_VALUE;
		int f=a[0];
		int s=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<f) {
				s=f;
				f=a[i];
			}
			else if(a[i]<s && a[i]!=f) {
				s=a[i];
			}
		}
		System.out.println(s);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {435,737,99,22,44};
		SecondSmallest.check(a);

	}

}
