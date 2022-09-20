package com.c19;
class SolarSystem{
	public void show1() {
	System.out.println("Solar class");}
} 
class Earth extends SolarSystem{
	public void show2() {
		System.out.println("Earth class");}
}
class Moon extends SolarSystem{
	public void show3() {
		System.out.println("Moon class");}
}


public class ClassHirearichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moon m=new Moon();
		m.show1();
		m.show3();
		Earth e=new Earth();
		e.show2();

	}

}
