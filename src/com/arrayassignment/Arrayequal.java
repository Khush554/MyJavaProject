package com.arrayassignment;

public class Arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 22, 32, 42, 52, 68};
		int b[]= {52, 22, 62, 12, 42, 22};
		int n=(a.length+b.length)/2;
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
			
		}
		if(count==n) {
		System.out.println("same array ");}
		else {
			System.out.print("not same");
		}

	}

}
