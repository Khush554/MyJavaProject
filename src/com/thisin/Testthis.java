package com.thisin;

//to refer current class instance variables
public class Testthis {
	int roll;
	Testthis(int roll){
		roll=roll;
	}
	void display() {
		System.out.println(roll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthis t=new Testthis(30);
		t.display();
		

	}

}
