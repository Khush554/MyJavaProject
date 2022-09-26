package com.ooptest1;

import java.util.Scanner;

class Games{
	public void show(String countryName) {
		String gamename="u";
		switch(countryName) {
		case "India":gamename="Hockey";break;
		case "China":gamename="Table Tennis";break;
		case "Bangladesh":gamename="Kabbadi";break;
		case "Italy":gamename="Football";break;
		case "United States":gamename="Baseball";break;
		default:System.out.println("Country not match");
		}
		System.out.println(countryName+" "+gamename);
	}
}
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Country name");
		String name=sc.next();
		Games s=new Games();
		s.show(name);
		

	}

}
