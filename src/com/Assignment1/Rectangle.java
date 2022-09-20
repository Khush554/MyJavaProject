package com.Assignment1;
//calculate the area of rectangle
public class Rectangle {
  int l;
  int w;
  Rectangle(int l,int w){
	  this.l=l;
	  this.w=w;
	  display();
	  
  }
  void display() {
	  System.out.println(l*w);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle s=new Rectangle(4,5);
		

	}

}
