package com.arrayassignment;

public class SearchElement {
	public static int check(int a[],int t) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				
				return i;
				}
			
		
		
	}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int target=3;
		SearchElement.check(a,target);
		System.out.println(SearchElement.check(a,target));

	}

}
