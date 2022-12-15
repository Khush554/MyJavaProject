package com.TwoDArray;

public class MinCol {
	public static void check(int a[][]) {
		for(int i=0;i<a.length;i++) {
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++) {
				if(min>a[j][i]) {
					min=a[j][i];
				}
				System.out.print(a[j][i]+" ");
			}
			System.out.print(" "+min);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		MinCol.check(a);

	}

}
