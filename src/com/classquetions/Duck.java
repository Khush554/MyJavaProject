package com.classquetions;

import java.util.Scanner;

public class Duck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp1=num;
		int r=0;
		while(temp1>0) {
			r=temp1%10;
			temp1=temp1/10;
		}
		int ans=0;
		System.out.println(r);
		if(r!=0) {
			for(int i=num;i>0;i=i/10) {
				int r2=i%10;
				if(r2==0) {
					ans++;
				}
			}
			System.out.println(ans);
			if(ans>0) {
				System.out.println("duck");
			}
			else {
				System.out.println("nduck");
			}
		}else {
			System.out.println("nduck");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*int count=0;
		while(num>0) {
			 rem=num%10;
			
			 num=num/10;
			 System.out.println(rem);
		}
		System.out.println(rem);
		/*if(count>0) {
			System.out.println("d");
		}
		else {
			System.out.println("n d");
		}*/
		}

}
