package com.ooptest1;
class Student
{
	int id;
	String name;
	int marks;
	int totalpercentage;
	int fees;
	Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	Student(int totalpercentage){
		this(1,"Khushi",400);
		totalpercentage=(marks*100)/500;
		this.totalpercentage=totalpercentage;
		//System.out.println(totalpercentage);
	}
	public void show() {
		this.fees(2000);
		System.out.println("id is"+id+" "+name+" "+"fees is="+fees);
	}
	public int fees(int fees) {
		this.fees=fees;
		return(fees);
	}
	public void methodcall(Student stu) {
		System.out.println("Student passes with"+totalpercentage+"percentage");
	}
	public void display() {
		methodcall(this);
	}
	
	}
public class ThisUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(99);
		s.show();
		s.display();

	}

}
