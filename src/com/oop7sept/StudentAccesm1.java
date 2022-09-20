package com.oop7sept;

public class StudentAccesm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccsesm s=new StudentAccsesm ();
		//s.acceptdetails1(0, null, 0, null);//private
		//System.out.println(s.id+" "+s.name+" "+s.marks+" "+s.address);
		//s.acceptdetails1(0, null, 0, null);
		//System.out.println(3+" "+s.name+" "+s.marks+" "+s.address);
		s.acceptdetails2(0, null, 0, null);
		System.out.println(4+" "+s.name+" "+s.marks+" "+s.address);
		s.acceptdetails3(0, null, 0, null);
		System.out.println(5+" "+s.name+" "+s.marks+" "+s.address);
		//protected and default are working with private protected instance
		//within same package

	}

}
