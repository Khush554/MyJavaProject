package com.c19;
class Animal5
{  int a;
	public void eat() {
		System.out.println("i can eat");
	}
	Animal5(){
		System.out.println("Const");
	}
	
}
class Dog4 extends Animal5{
	@Override
	public void eat() {
		super.a=2;
		System.out.println("i can eat dog food");
	}
	public void bark() {
		
		System.out.println("I can bark");
	}
}
class Cat3 extends Animal5{
	public void eat() {
		super.eat();
		System.out.println("i can eat cat food");
	}
	Cat3(){
		super();
	}
}

public class ClassSuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 a=new Dog4();
		a.eat();
		a.bark();
		Cat3 c =new Cat3();
		c.eat();
		

	}

}
