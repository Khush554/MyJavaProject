package com.op2;

public class Student2 {
	/*Now id, name in student class. assign value to id, name there Itself and in
	main method print values then change value of instance variables and again
	print the values (Observe you cannot access id directly without creating
	object)*/
	int id=2;
	String name="khusi";
	public void details(int i,String s) {
		System.out.println(id+" "+name);
		id=i;
		name=s;
		System.out.println(id+" "+name);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s=new Student2();
		s.details(3, "Mukul");

	}

}
