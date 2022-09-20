package com.op2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1=new Box();
		Box box2=new Box(2);
		
		Box box3=new Box(2,3,4);
		Box box4=new Box(box1);
		Weight w=new Weight();
		System.out.println(w.l+""+w.w);
		//cant access child variable with parent instance
		//System.out.println(box1.weight+""+box1.h+""+box1.w);
		System.out.println(box3.l+""+box3.h+""+box3.w);
		System.out.println(box2.l+""+box2.h+""+box2.w);
		System.out.println(box4.l+""+box4.h+""+box4.w);

	}

}
