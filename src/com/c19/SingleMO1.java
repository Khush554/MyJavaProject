package com.c19;
class Animal3
{
	public void eat() {
		System.out.println("i can eat");
	}
	
}
class Dog2 extends Animal3{
	@Override
	public void eat() {
		System.out.println("i can eat food");
	}
	public void bark() {
		System.out.println("I can bark");
	}
}
public class SingleMO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d= new Dog2();
		d.eat();
		d.bark();
				

	}

}
