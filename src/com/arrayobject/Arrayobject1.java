package com.arrayobject;

import java.util.Arrays;

class Employee{
	int empid;
	String empname;
	int salary;
	Employee(int empid,String empname,int salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	public String toString() {
		return empid+" "+empname+" "+salary;
	}
	
}
public class Arrayobject1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[]=new Employee[3];
		emp[0]=new Employee(1,"Ramesh",13334);
		emp[1]=new Employee(2,"Ramesh",13334);
		emp[2]=new Employee(3,"Ramesh",13334);
		///traditional
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("...................");
		//enhanced loop
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("...................");
		System.out.println(Arrays.toString(emp));

	}

}
