package com.AI;
//15 14 13 12 11
//10 9 8 7
//6 5 4
//3 2
//1

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}

	}

}
