package com.TwoDArray;

public class ColMax {
	public static void check(int ar[][]) {
		for(int i=0;i<ar.length;i++) {
			int max=ar[0][i];
			for(int j=0;j<ar[i].length;j++) {
				if(max<ar[j][i]) {
					max=ar[j][i];
				}
				System.out.print(ar[j][i]);
			}
			System.out.print(" "+ max);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,5,2},{7,8,6},{1,2,4}};
		ColMax.check(a);

	}

}
