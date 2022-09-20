package com.op2;

public class Student1 {
	//create class Student and create 2 objects of Student using new keyword
    int id;
    String name;
    public void details(int i,String n) {
    	id=i;
    	name=n;
    }
    public void display() {
    	System.out.println("id="+id+" "+"name="+name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		s.details(2,"Khushi");
		s.display();
		Student1 s1=new Student1();
		s1.details(2,"Khush");
		s1.display();

	}

}
