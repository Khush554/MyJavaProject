package com.c13;
 
public class cd {
static int a=10;
int b;
void show() {
	System.out.println("Method");
	a=20;
}
static void g() {
	System.out.println("Static method");
	//b=20;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cd c=new cd();
		c.show();
		System.out.println(a);
		cd.g();
		

	}

}
