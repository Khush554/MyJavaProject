package com.arrayassignment;

import com.interfacepackage.A;

public class Avg1 {
	public static int check(int array[]) {
		int avg=0;
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		avg=sum/array.length;
		return avg;
	}
	public static double check1(double array[]) {
		double avg=0;
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		avg=sum/array.length;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5}; 
		double b[]= {1,0.2,3,4.9,5.1}; 
		Avg1.check(a);
		Avg1.check1(b);
		System.out.println(Avg1.check(a));
		System.out.println(Avg1.check1(b));

	}

}
