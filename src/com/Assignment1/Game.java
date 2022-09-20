package com.Assignment1;

import java.util.Scanner;

/*National game of India is Hockey, China is Table Tennis,
Bangladesh is Kabaddi, Italy is Football,
United States is baseball. Write a Java program to
read country name as user-input and to print the
country’s national game. Use switch*/
public class Game {
	String countryname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game c=new Game();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter country name 1.India 2.China 3.Bangladesh 4.Italy 5.United States");
		c.countryname=sc.next();
		switch(c.countryname) {
		case "India":System.out.println("Hockey");break;
		case "China":System.out.println("Table Tennis");break;
		case "Bangladesh":System.out.println("Kabaddi");break;
		case "Italy":System.out.println("Football");break;
		case "United States":System.out.println("baseball");break;
		default:
			System.out.println("choose only above");
		
		}

	}

}
