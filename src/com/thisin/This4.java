package com.thisin;

public class This4 {
	int roll;
	int a;
	This4(int roll){
		this.roll=roll;
	}
	void displaym(This4 d) {
		System.out.println("this method");
	}
	void display(int a) {
		System.out.println(roll+" "+a);
	}
	void getdisplay() {
		display(30);
		displaym(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This4 t=new This4(33);
		t.getdisplay();
		t.display(3);

	}

}
