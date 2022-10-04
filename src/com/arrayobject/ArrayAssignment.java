package com.arrayobject;

import java.util.Scanner;

class Employeeq{
	int id;
	String name;
	int salary;
	Employeeq(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toSring() {
		return id+" "+name+""+salary;
	}
}
class Employeeq1{
	int empid;
	String empname;
	int salary;
	Employeeq1(int empid,String empname,int salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	public String toString() {
		return empid+" "+empname+" "+salary;
	}
	
}
public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Employeeq emp[]=new Employeeq[3];
				emp[0]=new Employeeq(1,"Ramesh",13334);
				emp[1]=new Employeeq(2,"Ramesh",13334);
				emp[2]=new Employeeq(3,"Ramesh",13334);
				///traditional
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i]);
				}
				Employeeq1 emp1[]=new Employeeq1[3];
				emp1[0]=new Employeeq1(1,"Ramesh",13334);
				emp1[1]=new Employeeq1(2,"Ramesh",13334);
				emp1[2]=new Employeeq1(3,"Ramesh",13334);
				///traditional
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp1[i]);
				}
//		Employee3 e[]=new Employee3[3];
//		
//		e[0]=new Employee3(1,"E",3000);
//		e[1]=new Employee3(1,"E",3000);
//		
//		e[2]=new Employee3(1,"E",3000);
//		for(Employee3 ee:e) {
//			System.out.println(ee);
//		}
//		int inc;
//		for(int i=0;i<e.length;i++) {
//			if(e[i].salary<15000) {
//				inc=e[i].salary*10/100+e[i].salary;
//			}
//			System.out.println(e[i]);
//		}
//		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<e.length;i++) {
//			System.out.println("Enter id");
//			int id=sc.nextInt();
//			System.out.println("Enter name");
//			String name=sc.next();
//			System.out.println("Enter salary");
//			int s=sc.nextInt();
//		
//			if(s<15000) {
//				int incs=s*10/100+s;
//				s=incs;
//				//System.out.println(incs);
//			}
//			
//			e[i]=new Employee3(id,name,s);
//		}
//		for(int j=0;j<e.length;j++) {
//			System.out.println(e[j]);
//		}

	}

}
