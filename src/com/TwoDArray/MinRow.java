package com.TwoDArray;

public class MinRow {
	public static void check(int a[][]) {
		for(int i=0;i<a.length;i++) {
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++) {
				if(min>a[i][j]) {
					min=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" "+min);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		MinRow.check(a);

	}

}
