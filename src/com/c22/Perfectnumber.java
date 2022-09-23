package com.c22;

import java.util.Scanner;

public class Perfectnumber {
	public void perfectn(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				int sq=j*j;
				if(sq==i) {
					System.out.println(i);
					break;
				}
						
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Perfectnumber p=new Perfectnumber();
		p.perfectn(num);

	}

}
