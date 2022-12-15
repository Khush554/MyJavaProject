package com.TwoDArray;

public class PrintPattern2Star {
	public static void check(char a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==0||j==0||i==a.length-1||j==a.length-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][]=new char[4][4];
		PrintPattern2Star.check(a);

	}

}
