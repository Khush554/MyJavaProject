package com.c15;
class Engine{
	String engineType;
	public void cardata(String EngineType) {
		this.engineType=EngineType;
	}
	public void showe() {
		System.out.println(engineType);
	}
	
	
}
public class ClassCar {
	int modelnumber;
	String name;
	double price;
	Engine eng;
	public void acceptdata(int modelnumber,String name,double price,Engine eng) {
		this.modelnumber=modelnumber;
		this.name=name;
		this.price=price;
		this.eng=eng;
	}
	public void showd() {
		System.out.println(modelnumber+" "+price+" "+name+""+eng);
		eng.showe();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassCar c=new ClassCar();
		c.acceptdata(2, "bmw", 2344400, new Engine());
		c.eng.cardata("petrol");
		c.showd();

	}

}
