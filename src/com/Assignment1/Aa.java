package com.Assignment1;
/*Write a program to copy values of one object into another by assigning the values of
one object into another.*/
public class Aa {
	int id;
	String name;
	Aa(int id,String name){
		this.id=id;
		this.name=name;
	}
	Aa(Aa d){
		id=d.id;
		name=d.name;
		
	}
	void display() {
		System.out.println(id+ " "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa s=new Aa(2,"kk");
		Aa s1=new Aa(s);
		s.display();
		s1.display();

	}

}
