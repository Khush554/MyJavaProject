package com.c19;
class Vehical1{
	int speed=223;
}
class Car1 extends Vehical1{
	int speed=233;
	public void show() {
		System.out.println(speed+" "+super.speed);
	}
}
public class Supervariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
		c.show();
		

	}

}
