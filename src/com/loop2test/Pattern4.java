package com.loop2test;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10;
		int ans=1;
		int rem;
		for(int i=1;i<=5;i++) {
			ans=ans*10;
			rem=ans/9;
			int ans1=rem*i;
			System.out.println(ans1);
			System.out.println(rem);
			//System.out.println(ans);
		}
			
		}

	}


