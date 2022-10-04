package com.array26;

import java.util.Scanner;

public class IncreasingdecBouncy {
	public static void numbercheck(int n) {
		boolean isincreasing=true;
		boolean isdecreasing=true;
		
		int rem=0;
		int pre=n%10;
		
		while(n>0) {
			rem=n%10;
			
			if(rem>pre) {
				isincreasing=false;
				break;
				
			}
			else if(rem<pre) {
				isdecreasing=false;
			}
			pre=rem;
			n=n/10;
		}
		if(isincreasing==true) {
			System.out.println("increasing");
		}
		if(isdecreasing==true) {
			System.out.println("decreasing");
		}
//		
		if(!isincreasing && !isdecreasing) {
			System.out.println("Bouncy");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		IncreasingdecBouncy.numbercheck(num);
		

	}

}
