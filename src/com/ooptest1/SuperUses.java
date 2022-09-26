package com.ooptest1;
class Parentclass{
	int a=10;
	public void show() {
		a=20;
		System.out.println(a);}
		Parentclass(){
			System.out.println("Parent constructor");
			
		}
	}
class Child extends Parentclass{
	public void show() {
		a=30;
		super.show();
		System.out.println(a+super.a);
	
	}
	Child(){
		super();
		System.out.println("Child Constructor");
	}
} 
public class SuperUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.show();
		

	}

}
