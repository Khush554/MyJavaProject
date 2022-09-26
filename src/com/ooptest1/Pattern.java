package com.ooptest1;

public class Pattern {
	void pattern() {
		int a=1;
		for(int i=1;i<=7;i++) {
			if(i%2==0) {
				continue;
			}
			for(int k=7;k>=i-1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=new Pattern();
		p.pattern();

	}

}
