package com.c19;
 class Animal{
	 int leg=4;
	 void show() {
		 System.out.println(leg);
	 }
	 
	 
 }
class Dog extends Animal{
	void show() {
		leg=2;
   System.out.println(leg);}
}







public class SingleI {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog d=new Dog();
   d.show();
	}

}
