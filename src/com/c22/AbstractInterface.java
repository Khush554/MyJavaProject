package com.c22;
abstract class Calculation{
	int a=3;
}
interface Addable{
	int b=8;
}
class Dog extends Calculation implements Addable{
	public void add() {
		System.out.println(a+b);
	}
}

public class AbstractInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.add();

	}

}
