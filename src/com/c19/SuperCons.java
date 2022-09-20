package com.c19;
class Person{
	Person(int a){
		System.out.println("Person const"+a);
	}
}
class Student extends Person{
	
	Student(){
		super(9);
		System.out.println("Student const");
	}
}
public class SuperCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();

	}

}
