package com.c22;
abstract class Mobile{
	abstract void show();
	Mobile(String mobiletype){
		System.out.println(mobiletype);
	}
}
class Apple extends Mobile{
	Apple(){
		super("Android");
	}
	void show() {
		System.out.println("Child class");
	}
}
public class Abstractclass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		a.show();

	}

}
