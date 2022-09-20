package com.Assignment1;

public class A5a {
	int a,b,c,d;
	A5a(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	public void addition(int c,int d) {
		this.c=c;
		this.d=d;
		System.out.println(c-d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new A5a(1,2).addition(3, 2);
      new A5a(4,5).a=9;
	}

}
