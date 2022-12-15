package com.TwoDArray;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i].length);
				a[i][j]=sc.nextInt();
				b[i][j]=sc.nextInt();
			}
		}
		int sum[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<b.length;k++) {
					for(int l=0;l<b[i].length;l++) {
						 sum[i][j]=a[i][j]+b[k][l];
					}
				}
			}
		}
		for(int x[]:sum) {
			for(int y:x) {
			System.out.print(y+" ");
		}
		System.out.println();	
		}
		

	}

}
