package com.ooptest1;

class Cat{
	public Animal1 show() {
		return new Animal1();
	}
}
class Kitten extends Cat{
	public Dog1 show() {
		super.show();
		return new Dog1();
	}
	
}



public class CovarientExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kitten k=new Kitten();
		Dog1 d=k.show();
		Animal1 a=k.show();
		System.out.println(d+" "+a);
		

	}

}
