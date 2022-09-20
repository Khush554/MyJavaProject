package com.c19;
class Fruits1{
	int quantity;
	public void show() {
		System.out.println("fruit class"+quantity);
	}
}
class Mango1 extends Fruits1{
	public void show1() {
		quantity=2;
		System.out.println("Mango class"+quantity);
	}
}
class Apple1 extends Fruits1{
	public void show2() {
		quantity=3;
		System.out.println("Apple class"+quantity);
	}
}
public class ClassMultilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango1 m=new Mango1();
		m.show();
		m.show1();
		Apple1 a=new Apple1();
		a.show2();

	}

}
