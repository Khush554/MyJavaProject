package com.c19;
class Fruits{
	int quantity;
	public void show() {
		System.out.println("fruit class"+quantity);
	}
}
class Mango extends Fruits{
	public void show1() {
		quantity=2;
		System.out.println("Mango class"+quantity);
	}
}
public class ClassSingle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango m=new Mango();
		m.show();
		m.show1();

	}

}
