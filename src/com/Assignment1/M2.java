package com.Assignment1;
/*Create getId() method in Student class. call getId() method
from displayData method so that you know that one
method can be called from another method. Return id
from getId() method and set that id to the instance
variable in displayData method.*/
public class M2 {
	int id;
	public int getid(int id) {
		return id;
	}
	public void display() {
		id=getid(10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M2 m=new M2();
		m.display();
		System.out.print(m.id);

	}

}
