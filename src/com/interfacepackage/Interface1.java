package com.interfacepackage;
 
interface Moveable{
	int c=4;
	void move();
	default void run() {};
	static void run1() {};
	default int add(int a) {return a;}
	static int add1(int b) {return b;}
	//final void move1() {};
	
}
class Addition implements Moveable{
	public void move() {
		System.out.println("child move");
	}
	public void run() {
		System.out.println("child run");
	}
	static void run1() {
		System.out.println("child run1");
	}
	public int add(int a) {return a;}
	public int add1(int b) {return b;}
}






public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		int a1=a.add(2);
		int b1=a.add1(3);
		System.out.println(a1+b1+Moveable.c);

	}

}
