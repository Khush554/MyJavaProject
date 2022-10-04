package com.arrayobject;

import java.util.Scanner;

class Employee2{
	int empid;
	String empname;
	int salary;
	Employee2(int empid,String empname,int salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	public String toString() {
		return empid+" "+empname+" "+salary;
	}
	
}
public class ArrayObject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp[]=new Employee1[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			emp[i]=new Employee1(id,name,sal);
		}
		for(int i=0;i<emp.length;i++) {
			if(emp[i].salary>2000) {
			System.out.println(emp[i]);
		}}

	}

}
