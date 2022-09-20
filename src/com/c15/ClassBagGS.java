package com.c15;
class Pen{
	int price;
	String color;
	String brandname;
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrandname(String brandname) {
		this.brandname=brandname;
	}
	public void setColor(String color) {
		this.color=color;
	}
}
public class ClassBagGS {
	String brandname;
	int price;
	Pen p;
	
	public int getPrice() {
		return price;
	}
	public Pen getPen() {
		return p;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrandname(String brandname) {
		this.brandname=brandname;
	}
	public void setPen(Pen p) {
		this.p=p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassBagGS c=new ClassBagGS ();
		c.setBrandname("cello");
		c.setPrice(500);
		c.setPen(new Pen());
		c.getPen().setBrandname("Skybag");
		c.getPen().setColor("yellow");
		c.getPen().setPrice(22);
		System.out.println(c.getBrandname()+" "+c.getPrice()+" "+c.getPen().getBrandname()+" "+c.getPen().getColor()+" "+c.getPen().getPrice());

	}

}
