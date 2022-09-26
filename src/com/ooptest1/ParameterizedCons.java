package com.ooptest1;
class Fruit{
	int price;
	int quantity;
	String name;
	Fruit(int price,int quantity,String name){
		this.price=price;
		this.quantity=quantity;
		this.name=name;
		
		System.out.println("price is"+price+"quantity is"+quantity+"name is"+name);
	}
}
public class ParameterizedCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit(200,2,"Mango");

	}

}
