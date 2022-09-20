package com.c15;

import java.util.Scanner;

class Engine2{
	String engine;
	String gear;
	Engine2(String engine,String gear ){
		this.engine=engine;
		this.gear=gear;
	}
	public String toString() {
		return engine+" "+gear;
	}
	
}
public class ClassCarToString {
	int modelnumber;
	String name;
	double price;
	Engine2 eng;
	ClassCarToString(int modelnumber,String name,double price,Engine2 eng){
		this.modelnumber=modelnumber;
		this.name=name;
		this.price=price;
		this.eng=eng;
	}
	public String toString() {
		return modelnumber+" "+name+" "+price+" "+eng;
	}
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter engine and gear type");
		    String e=sc.next();
		    String g=sc.next();
		ClassCarToString c=new ClassCarToString(2,"bmw",33333,new Engine2(e,g));
	   
		System.out.println(c);
	}

}
