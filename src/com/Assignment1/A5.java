package com.Assignment1;

public class A5 {
	//Write a program to demonstrate anonymous object.
	//which have no reference varible
	int id;
	String name;
	A5(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id+" "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A5(2,"kh").display();
		

	}

}
