package com.oop12;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long num1=num;
		long rem;
		
		for(int i=0;i<=9;i++) {
			num=num1;
			int count=0;
			while(num>0) {
				rem=num%10;
				if(rem==i) {
					count++;
				}
				num=num/10;
				//System.out.println(rem+" "+count);
			}
			if(count>0) {
			
			System.out.println(i+" "+count);
		}
			}
		
	}

}
