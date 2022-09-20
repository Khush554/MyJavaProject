package com.c19;
class Animal4
{  int a;
	public void eat() {
		System.out.println("i can eat");
	}
	
}
class Dog3 extends Animal4{
	@Override
	public void eat() {
		super.a=2;
		System.out.println("i can eat food");
	}
	public void bark() {
		System.out.println("I can bark");
	}
}
public class SingleMO1S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d= new Dog3();
		d.eat();
		d.bark();

	}

}
