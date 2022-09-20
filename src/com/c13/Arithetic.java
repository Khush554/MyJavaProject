package com.c13;

public class Arithetic {
	
	public void arithmetic(int a,int b) {
		System.out.println(a+b);
	}
	public void arithmetic(float a,int b) {
		System.out.println(a-b);
	}
	public void arithmetic(int a,float b) {
		System.out.println(a*b);
	}
	public void arithmetic(float a ,float b) {
		System.out.println(a/b);
	}
	public void arithmetic(float y,double x) {
		System.out.println(x%y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithetic a=new Arithetic();
		a.arithmetic(1, 2);
		a.arithmetic(20f, 4);
		a.arithmetic(2, 4f);
		a.arithmetic(20f, 3);
		a.arithmetic(22f, 3);

	}

}
