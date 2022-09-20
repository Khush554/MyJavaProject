package com.c20;
abstract class ObjectMovement{
	int speed;
	static String direction="Forward";
	abstract public void move(int speed);
}
class Ball extends ObjectMovement{
	public void move(int s) {
		this.speed =s;
		System.out.println("now ball is rolling with the spped"+speed+"meter/minute"
				+ ObjectMovement.direction+"Direction");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
