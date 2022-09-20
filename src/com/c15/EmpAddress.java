package com.c15;

public class EmpAddress {
	int sno,pin;
	String city,soci;
	EmpAddress(int sno,int pin,String soci,String city) {
		this.sno=sno;
		this.pin=pin;
		this.soci=soci;
		this.city=city;
		
	}
	public void display() {
		System.out.println(sno+" "+pin+" "+soci+" "+city);
	}


}
