package com.array26;

public class ArraycharReplacment {
	static void charR(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='z'||arr[i]=='Z'||arr[i]=='y'||arr[i]=='Y') {
				char c=(char)(arr[i]-24);
				System.out.println(c);
			}
			else {
			char r=((char)(2+(arr[i])));
			System.out.println(r);
		}}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []a= {'a','X','e','s','Z'};
		
		ArraycharReplacment.charR(a);
		

	}

}
