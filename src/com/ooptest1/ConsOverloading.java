package com.ooptest1;
class Arithmetic {
	Arithmetic(int a,int b){
		System.out.println(a+b);
	}
	Arithmetic(int a,int b,int c){
		System.out.println(a+b+c);
	}
	Arithmetic(float a,int b){
		System.out.println(a+b);
	}
	Arithmetic(double a,int b){
		System.out.println(a+b);
	}
	Arithmetic(double a,double b){
		System.out.println(a+b);
	}
	Arithmetic(double a,float b){
		System.out.println(a+b);
	}
	
}
public class ConsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic c=new Arithmetic(1,2,3);

	}

}
