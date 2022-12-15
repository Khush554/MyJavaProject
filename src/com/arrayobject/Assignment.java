package com.arrayobject;

import java.util.Scanner;

class Employeedetail{
	int id;
	String name;
	int salary;
	Employeedetail(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeedetail e[]=new Employeedetail[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter id");
			int id1=sc.nextInt();
			System.out.println("Enter name");
			String n=sc.next();
			System .out.println("Enter salary");
			
			int s=sc.nextInt();
			
			e[i]=new Employeedetail(id1,n,s);
		}
       for(int i=0;i<e.length;i++) {
    	   
    	   //System.out.println(e[i]);
    	   if(e[i].salary<15000) {
    		   int incs=e[i].salary*10/100+100;
    		   e[i].salary=e[i].salary+incs;
    		  // System.out.println(e[i].id+""+e[i].name+" "+data);
    	   }
    	   System.out.println(e[i]);
    	   
       }
	}

}
