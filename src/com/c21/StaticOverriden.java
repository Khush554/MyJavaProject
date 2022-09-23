package com.c21;
class StaticO{
	 static void show() {
		System.out.println("Static1");
	}
}
class B extends StaticO{
	//@Override
	 static void show() {
		 
		System.out.println("Static2");
	}
}
class C extends StaticO{
	 static void show() {
			System.out.println("Static3");
		}
}
public class StaticOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticO a=new B();
		a.show();
		//B b=new B();
		//b.show();

	}

}
