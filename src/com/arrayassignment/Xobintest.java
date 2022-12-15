package com.arrayassignment;

public class Xobintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int maxf=a[0];
		int maxs=a[0];
		int sum=0;
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>maxf) {
				maxs=maxf;
				maxf=a[i];
			}
		}
		System.out.println(maxf+" "+maxs);
		sum=maxf+maxs;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		sum1=sum1-sum;
		System.out.println(sum1);

	}

}
