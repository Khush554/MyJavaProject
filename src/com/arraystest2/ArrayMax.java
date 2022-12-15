package com.arraystest2;

public class ArrayMax {
	public static void check(int ar[][]) {
		
		for(int i=0;i<ar.length;i++) {
			int max=ar[i][0];
			for(int j=0;j<ar[i].length;j++) {
				if(max<ar[i][j]) {
					max=ar[i][j];
				}
				System.out.print(ar[i][j]+" ");
			}
			System.out.print(" "+ max);
			System.out.println();}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{22,31,9},{22,25,16}};
		ArrayMax.check(a);

	}

}
