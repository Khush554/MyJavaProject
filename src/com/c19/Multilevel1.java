package com.c19;
class Mobile{
	String bname;
}
class Apple extends Mobile{
	String ram;
}
class Iphone extends Apple{
	String camera="32px";
	void show() {
		bname="x";
		ram="123";
		System.out.println(bname+" "+ram+" "+camera);
	}
}
public class Multilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone p=new Iphone();
		p.show();

	}

}
