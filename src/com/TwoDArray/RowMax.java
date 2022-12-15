package com.TwoDArray;

import com.interfacepackage.A;

public class RowMax {
	public static void check(int ar[][]) {
		for(int i=0;i<ar.length;i++) {
			int max=ar[0][i];
			for(int j=0;j<ar[i].length;j++) {
				if(max<ar[i][j]) {
					max=ar[i][j];
				}
				System.out.print(ar[i][j]);
			}
			System.out.print(" "+ max);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		RowMax.check(a);

	}

}
