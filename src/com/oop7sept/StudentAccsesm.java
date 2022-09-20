package com.oop7sept;

public class StudentAccsesm {
	private int id;
	String name;
	public int marks;
	protected String address;
	public void acceptdetails(int id,String name,int marks,String address) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	private void acceptdetails1(int id,String name,int marks,String Address) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	protected void acceptdetails2(int id,String name,int marks,String Address) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	void acceptdetails3(int id,String name,int marks,String Address) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccsesm s=new StudentAccsesm ();
		s.acceptdetails1(0, null, 0, null);
		System.out.println(s.id+" "+s.name+" "+s.marks+" "+s.address);
		s.acceptdetails1(0, null, 0, null);
		System.out.println(3+" "+s.name+" "+s.marks+" "+s.address);
		s.acceptdetails2(0, null, 0, null);
		System.out.println(4+" "+s.name+" "+s.marks+" "+s.address);
		s.acceptdetails3(0, null, 0, null);
		System.out.println(5+" "+s.name+" "+s.marks+" "+s.address);
		//all are working within class with different modifier
		

	}*/

}
