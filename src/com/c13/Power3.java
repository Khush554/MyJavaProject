package com.c13;

import java.util.Scanner;

public class Power3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ans=1;
		if(num%3==0) {
			for(int i=1;i<=3;i++) {
				ans=ans*num;
			}
			if(ans%3==0) {
				System.out.println("true");
			}
			
		}
		else {
			System.out.println("false");
		}
		//System.out.println(num);
		//System.out.println(ans);
		

	}

}
