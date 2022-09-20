package com.c15;
class Engine1{
	String enginetype;
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype=enginetype;
	}
}
public class ClassCarGS {
	int modelnumber;
	String name;
	double price;
	Engine1 eng;
	public int getModelnumber() {
		return modelnumber;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Engine1 getEngine() {
		return eng;
	}
	public void setModelnumber(int modelnumber) {
		this.modelnumber=modelnumber;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setEng(Engine1 eng) {
		this.eng=eng;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassCarGS c=new ClassCarGS();
		c.setModelnumber(3);
		c.setName("bmw");
		c.setPrice(234322);
		c.setEng(new Engine1());
		c.getEngine().setEnginetype("petrol");
		System.out.println(c.getModelnumber()+" "+c.getName()+" "+c.getPrice()+" "+c.getEngine().getEnginetype());
		

	}

}
