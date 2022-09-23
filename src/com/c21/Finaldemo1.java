package com.c21;
class Finalv{
	final int x=20;
	final int y;
	Finalv(){
		y=30;
	}
}
class C1 extends Finalv{
	public void show() {
		System.out.println(x);
	}
}
public class Finaldemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C1 c=new C1();
        c.show();
	}

}
