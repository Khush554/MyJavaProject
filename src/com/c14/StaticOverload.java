package com.c14;

public class StaticOverload {
	static int x;
	static int y;
	public static void add(int x) {
		StaticOverload.x=x;
		System.out.println(x);
	}
	public static void add(int x,int y) {
		StaticOverload.x=x;
		StaticOverload.y=y;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10);
		add(10,20);

	}

}
