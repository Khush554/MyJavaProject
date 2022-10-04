package com.AI;
abstract class Animal{
	abstract void sleep();
	Animal(int a){
		int a1=a;
		System.out.println("Cons");
	}
}
class Dog extends Animal{
//	Dog(){
//		//super();
//	}
	Dog(){
		super(22);
		System.out.println();
	}
	public void sleep() {
		System.out.println("Sleep");
	}
}
public class ConstructorAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.sleep();

	}

}
