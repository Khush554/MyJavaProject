package com.arraytest1;
class Engine{
	int engineid;
	String lastenginecleandate;
	Engine(int engineid,String lastenginecleandate){
		this.engineid=engineid;
		this.lastenginecleandate=lastenginecleandate;
	}
	public String toString() {
		return engineid+" "+lastenginecleandate;
	}
}
class SubEngine{
	String subenginetype;
	SubEngine(String subenginetype){
		this.subenginetype=subenginetype;
	}
	public String toString() {
		return subenginetype; 
	}
	
}
class Gear{
	String type;
	Gear(String type){
		this.type=type;
	}
	public String toString() {
		return type;
	}
}
class Car{
	int carid;
	String carcolor;
	Engine engine;
	SubEngine sube;
	Gear gear;
	Car(int carid,String carcolor,Engine engine,SubEngine sube,Gear gear){
		this.carid=carid;
		this.carcolor=carcolor;
		this.engine=engine;
		this.sube=sube;
		this.gear=gear;
	}
	public String toString() {
		return carid+""+carcolor+" "+engine+" "+sube;
	}
}
public class ContainmentCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(1,"blue",new Engine(2,"19 oct 2022"),new SubEngine("SDDf"),new Gear("Automatic"));
		System.out.println(c);

	}

}
