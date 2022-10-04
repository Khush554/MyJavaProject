package com.AI;
abstract class E{
  abstract  void m3();
  static void m2() {
	  System.out.println("S");
  }
	  
  
}
public class Abstractstaticdemo  extends E{
	public void m3() {}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstractstaticdemo x=new Abstractstaticdemo();
		E.m2();

	}

}
