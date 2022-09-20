package com.Assignment1;

import java.util.Scanner;

/*. From scanner In loop (for 2 iterations) read Student
data create new object each time assign values and print
student values in console.*/
public class A9 {
 int id;
 String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9 a=new A9();
		for(int i=1;i<=2;i++) {
		Scanner sc=new Scanner(System.in);
		a.id=sc.nextInt();
		a.name=sc.next();
		System.out.println(a.id+" "+a.name);

	}}

}
