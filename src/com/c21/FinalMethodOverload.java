package com.c21;

public class FinalMethodOverload {
     final void show() {
    	 System.out.println("final1");
     }
     final void show(int a) {
    	 System.out.println(a);
     }
     final void show(int a,int b) {
    	 System.out.println(a+b);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethodOverload a=new FinalMethodOverload();
		a.show();
		a.show(20);
		a.show(20, 30);

	}

}
