package com.c15;
class Addre {
	int pincode;
	String city;
	Addre(int pincode,String city){
		this.pincode=pincode;
		this.city=city;
	}
	public String toString() {
		return pincode+" "+city;
	}
	
}
public class ClassPersonToString {
	int id;
	String name;
	Addre adr;
	ClassPersonToString(int id,String name,Addre adr){
		this.id=id;
		this.name=name;
		this.adr=adr;
		
	}
	public String toString() {
		return id+""+name+" "+adr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPersonToString c=new ClassPersonToString(2,"khushi",new Addre(123,"pune"));
		System.out.println(c);

	}

}
