package com.AI;
class SS{
	public static void s1() {
		System.out.println("eahh");
	}
}
public class Staticv extends SS{
	public static void s1() {
		System.out.println("eeeeeeeeahh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
   Staticv c=new Staticv();
   c.s1();
   
    //Staticv x=new SS();
 //  x.s1();

	}

}
