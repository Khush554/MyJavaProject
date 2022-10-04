package com.AI;
abstract class A{
abstract void m();
void sleep()
{
System.out.println("Sleep");
}

}
class B extends A{
public void m(){
System.out.println("Abstract method");
}}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m();
		b.sleep();
		A a=new B();
		a.m();
		a.sleep();

	}

}
