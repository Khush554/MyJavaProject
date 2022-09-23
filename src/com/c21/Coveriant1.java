package com.c21;
class Vehicle{
	public Motorcycle show1() {
		return new Motorcycle();
	}
	
}
class car extends Vehicle{
	public Bike show2() {
		return new Bike();
	}
	
}
public class Coveriant1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      car c=new car();
	      Bike c1=c.show2();
	      System.out.println(c.show1());
		
		

	}

}
