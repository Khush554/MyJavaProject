package com.c19;
class Animal1{
	String name;
	public void eat() {
		System.out.println("i can eat");
	}}

class Dog1 extends Animal1{
	 public void display() {
		    System.out.println("My name is " + name);
		  }
}


public class Single2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.name="tommy";
		d.eat();
		d.display();

	}

}
