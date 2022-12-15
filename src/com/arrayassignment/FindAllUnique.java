package com.arrayassignment;

public class FindAllUnique {
	public static void check(int a[]) {
		for(int i=0;i<a.length;i++) {
			int j=0;
			
			for(j=0;j<i;j++) {
				if(a[i]==a[j]) {
					break;
				}
				 
				}
			if(i==j) {
				System.out.print(a[i]+" ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6, 10, 5, 4, 9, 120, 4, 6, 10};
		 FindAllUnique.check(a);

	}

}
