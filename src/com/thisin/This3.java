package com.thisin;

public class This3 {
	int roll;
	int b;
	This3 getq() {
		b=20;
		System.out.println("retun");
		return this;
	}
	
	This3(int roll){
		this.roll=roll;
	
		System.out.println("roll const");
	}
	void display() {
		System.out.println(roll+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This3 t=new This3(30);
		//t.display();
		t.getq().display();
		This3 t1=new This3(330);
		//t1.getq();
		//This3 t1=new This3();
		

	}

}
