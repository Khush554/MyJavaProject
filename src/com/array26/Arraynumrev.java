package com.array26;

import java.util.Scanner;

public class Arraynumrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lenght=sc.nextInt();
		int a[]=new int[lenght];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
