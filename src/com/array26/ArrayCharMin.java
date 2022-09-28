package com.array26;

import java.util.Scanner;

public class ArrayCharMin {
	 static void minc(char a[]) {
		 char min=a[0];
		 for(int i=0;i<a.length;i++) {
			if(min>a[i]){
			min=a[i];}
		 }
		 System.out.println(min);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[5];
		for(int i=0;i<ch.length;i++) {
		   ch[i]=sc.next().charAt(0);
		}
		ArrayCharMin.minc(ch);

	}

}
