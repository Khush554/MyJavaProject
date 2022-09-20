package com.c15;

 class Address {
	int pincode;
	String city;
	Address(int pincode,String city){
		this.pincode=pincode;
		this.city=city;
	}
	public void show_Address() {
		System.out.println(pincode+" "+city);
	}
}

public class Containmentperson {
       
	int id;
    String name;
    Address adr;
	
	Containmentperson(int id,String name,Address adr){
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public void show_person() {
		System.out.println(id+" "+name+" "+adr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Containmentperson c=new Containmentperson(1,"neha",new Address(1234,"pune"));
        c.show_person();
        Address a=new Address(22,"pune");
        a.show_Address();
       
		System.out.println(c); 
	}

}
