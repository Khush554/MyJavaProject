package com.Assignment1;
/*Create class Box and calculate the volume of box
volume=length x width x heigh*/
public class Box {
    int l;
    int h;
    int w;
    Box(int l,int h,int w){
    	this.l=l;
    	this.h=h;
    	this.w=w;
    }
    void disply() {
    	System.out.println(l*h*w);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(2,4,2);
		b.disply();

	}

}
