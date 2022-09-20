package com.oop7sept;

public class AccessModifier {
	private int num;
	int num1;
	protected int num2;
	private void m() {
		num=1;
		num1=2;
	}
	protected void pm() {
		num=1;
		num1=4;
		num2=5;
	}
	

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier a=new AccessModifier();
		//int y=a.num;
		System.out.println(a.num);
		System.out.println(a.num1);
		
		a.m();
		System.out.println(a.num);
		System.out.println(a.num1);
		//protected
		System.out.println(a.num2);
		a.pm();
		System.out.println(a.num);
		System.out.println(a.num1);
		System.out.println(a.num2);
		
		
		

	}

}
