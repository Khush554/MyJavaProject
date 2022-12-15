package com.arrayassignment;

public class CountTotal {
	public static void check(int a[],int c)
	{
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1 ,2,3,4,1,2,3,4,5};
		int count=0;
		CountTotal.check(a,count);

	}

}
