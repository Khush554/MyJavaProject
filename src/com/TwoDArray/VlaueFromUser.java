package com.TwoDArray;

import java.util.Scanner;

public class VlaueFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
