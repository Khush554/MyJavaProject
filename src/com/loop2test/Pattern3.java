package com.loop2test;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
		  int a=i*i-1;
		  System.out.print(a+" ");
		}
		

	}

}
