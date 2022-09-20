package com.oop12;

public class Cons {
	int a;
	int b;
	int c;
	Cons(){
		this(10,20);
		c=10;
	}
	Cons(int a,int b){
		this.a=a;
		this.b=b;
	}
	Cons(int c){
		this.c=c;
	}
	public void display() {
		System.out.println(a+b+c);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c=new Cons();
		c.display();
		

	}

}
