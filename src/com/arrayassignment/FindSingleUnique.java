package com.arrayassignment;

public class FindSingleUnique {
	public static void check(int a[] ) {
		for(int i=0;i<a.length;i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(a[i]==a[j]);{
				break;}
			}
			if(i==j) {
				System.out.println(a[i]);}
			
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,1,2,3,4};
		FindSingleUnique.check(a);

	}

}
