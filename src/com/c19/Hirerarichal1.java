package com.c19;
 class Vehical{
	 int wheels;
 }
 class Car extends  Vehical{
	 public void showcar() {
		 wheels=4;
		 System.out.println(wheels);
	 }
 }
 class Truck extends  Vehical{
	 public void showtruck() {
		 wheels=12;
		 System.out.println(wheels);
	 }
 }
public class Hirerarichal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.showcar();
		Truck t=new Truck();
		t.showtruck();
      
	}

}
