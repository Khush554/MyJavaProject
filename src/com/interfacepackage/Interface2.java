package com.interfacepackage;
interface Engine{
	void start();
	void stop();
	void accelerate();
	static final int b=20;
}
interface Brake{
	void brake();
}
interface MediaPlayer extends Brake{
	void start();
	void stop();
}
interface Gear {
	void gearType();
}
class Car implements Engine,Brake,Gear{
	int g=20;

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("brake");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("accelerate");
		
	}

	@Override
	public void gearType() {
		// TODO Auto-generated method stub
		System.out.println("Manual");
		
	}
	
	
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine c=new Car();
	
		//Car c1=new Car();
		
		//int l=c1.g;
		c.accelerate();
		//c.brake();
		c.start();
		c.start();
		//c.b;
		//static type;
		int c2=Engine.b;
		System.out.println(c2);
		
	
		
		//c.gearType();

	}

}
