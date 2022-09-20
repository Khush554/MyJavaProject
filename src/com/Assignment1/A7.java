package com.Assignment1;
/*add id,name in student class. assign value to id name there
itself and in main method print values. Then change value
of instance variables and again print the values. Observe
you cannot access id directly without creating object. Also
2 objects have 2 seperate set of data*/
public class A7 {
	int id=2;
	String name="kk";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 a=new A7();
		System.out.println(a.id+" "+a.name);
		
		a.id=3;
		a.name="kh";
		System.out.println(a.id+" "+a.name);


	}

}
