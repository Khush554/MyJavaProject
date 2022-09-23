package com.c21;
class Motorcycle{
	public void show() {
		System.out.println("Motor parent");
	}
}
class Bike extends Motorcycle{
	public void show() {
		System.out.println("Bike child");
	}
}
public class Covariantvehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
