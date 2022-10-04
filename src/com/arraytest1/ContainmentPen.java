package com.arraytest1;

class Nib{
	private String materialtype;
	private int width;
	public String getMaterialtype() {
		return materialtype;
	}
	public int getWidth() {
		return width;
	}
	public void setMaterialtype(String materialtype) {
		this.materialtype=materialtype;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public String toString() {
		return "materialtype="+ materialtype+" "+"width="+width;
	}
}

class Refill{
	private String ink;
	private int lenght;
	private Nib nib;
	public String getInk() {
		return ink;
	}
	public int getLength() {
		return lenght;
	}
	public Nib getNib() {
		return nib;
	}
	public void setInk(String ink) {
		this.ink=ink;
	}
	public void setLength(int length) {
		this.lenght=length;
	}
	public void setNib(Nib nib) {
		this.nib=nib;
	}
	public String toString() {
		return "ink="+ink+" "+"length="+lenght+" "+"nib="+nib;
	}
	
}

class Pen{
	private Refill refill;
	private int caplength;
	private String brand;
	public int getCaplength() {
		return caplength;
	}
	public String getBrand() {
		return brand;
	}
	public Refill getRefill() {
		return refill;
	}
	public void setCaplength(int caplength ) {
		this.caplength=caplength;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setRefill(Refill refill) {
		this.refill=refill;
	}
	public String toString() {
		return "caplength="+caplength+" "+"brand="+brand+" "+"refill="+refill;
	}
	
	
}



public class ContainmentPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen a=new Pen();
		a.setRefill(new Refill());
		a.getRefill().setInk("Blue");
		a.getRefill().setLength(11);
		a.getRefill().setNib(new Nib());
		a.getRefill().getNib().setMaterialtype("Iron");
		a.getRefill().getNib().setWidth(1);
		a.setCaplength(1);
		a.setBrand("cello");
		//System.out.println(a+a.getRefill().getNib().getMaterialtype()+a.getRefill().getNib().getWidth());
		System.out.println(a);
	
		

	}

}
