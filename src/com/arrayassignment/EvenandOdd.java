package com.arrayassignment;

public class EvenandOdd {
	public static void check(int a[]) {
		int even[]=new int[a.length];
		int odd[]=new int[a.length];
		int pose=0,poso=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[pose]=a[i];
				pose++;
			}
			else {
				odd[poso]=a[i];
				poso++;
			}
		}
		for(int k=0;k<pose;k++){
			System.out.print(even[k]+" ");
			
		}
		System.out.println();
		for(int k=0;k<pose;k++){
			System.out.print(odd[k]+" ");
			
		}
//		for(int i=0;i<even.length;i++) {
//			if(even[i]>0) {
//				System.out.print(even[i]+" ");
//			}
//		}
//		System.out.println();
//		for(int i=0;i<odd.length;i++) {
//			if(odd[i]>0) {
//				System.out.print(odd[i]+" ");
//			}
//		}
//		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		 EvenandOdd .check(a);

	}

}
