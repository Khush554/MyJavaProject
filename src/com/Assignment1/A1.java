package com.Assignment1;

public class A1 {
	 //create class Student
	int id ;
	String name;
	public void accept(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		a.display();

	}

}
