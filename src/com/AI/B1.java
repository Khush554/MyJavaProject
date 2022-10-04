package com.AI;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1011;
		int rem=0;
		int value=1;
		int temp=0;
		while(n>0) {
			rem=n%10;
			temp=temp+rem*value;
			value=value*2;
			n=n/10;
			
		}
		System.out.println(temp);
	}

}
