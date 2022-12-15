package com.arrayassignment;

public class InsertSpecificPosition {
	public static void check(int a[],int e) {
		for(int i=0;i<a.length;i++) {
			if(i==2) {
				a[i]=e;
				break;
			}
		}
		for(int c:a) {
			System.out.print(c+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5}; 
		int e=12;
		InsertSpecificPosition.check(a,e);

	}

}
