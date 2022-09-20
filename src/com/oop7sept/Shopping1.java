package com.oop7sept;

public class Shopping1 {
	int pitem;
	int totalprice;
	int quantity;
	public void acceptdetails(int p,int q,int t) {
		pitem=p;
		totalprice=t;
		quantity=q;
		
	}
	public void bill() {
		if(quantity>0&&pitem>0) {
			totalprice=pitem*totalprice;
			display();
		}
		
		else {
			System.out.println("error");
		}
		//display();
	}
	public void display() {
		System.out.println("pitem="+" "+pitem+" "+"quantity="+quantity+" "+"totalprice="+totalprice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping1 s=new Shopping1();
		s.acceptdetails(0, 1, 10);
		s.bill();
		
		

	}

}
