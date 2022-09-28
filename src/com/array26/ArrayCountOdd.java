package com.array26;

import java.util.Scanner;

public class ArrayCountOdd {
	public static int countnumber(int ar[]) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int length=sc.nextInt();
		System.out.println("Enter value for array");
		int a[]=new int[length];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int result=new ArrayCountOdd().countnumber(a);
		System.out.println(result);

	}

}
