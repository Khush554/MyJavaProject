package com.Assignment1;

public class A2 {
	//create 2 objects of Student using new keyword
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
		A2 s1=new A2();
		A2 s2=new A2();
		s1.accept(9,"khushi");
		s2.accept(3, "mukul");
		s1.display();
		s2.display();

	}

}
