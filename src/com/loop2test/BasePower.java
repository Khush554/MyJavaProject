package com.loop2test;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int ans=1;
		for(int i=1;i<=y;i++) {
			ans=ans*x;
		}
		System.out.println(ans);

	}

}
