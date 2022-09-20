package com.c15;
class Addresse{
	int pincode;
	String city;
	Addresse(int pincode,String city){
		this.pincode=pincode;
		this.city=city;
	}
	public void show_Address() {
		System.out.println(pincode+" "+city);
	}
}
public class ClassPerson {
	int id;
	String name;
	Addresse adr;
	ClassPerson(int id,String name,Addresse adr){
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public void show() {
		System.out.println(id+" "+name+" "+adr);
		adr.show_Address();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPerson p=new ClassPerson(2,"khush",new Addresse(1234,"pune"));
		p.show();

	}

}
