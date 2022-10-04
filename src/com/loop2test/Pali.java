package com.loop2test;

import java.util.Scanner;

public class Pali {
	public void rev(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("palindrone");
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Pali p=new Pali();
		p.rev(num);

	}

}
