package com.arrayobject;

import java.util.Arrays;
import java.util.Scanner;

class Department1{
	int did;
	String dname;
	Department1(int did,String dname){
		this.did=did;
		this.dname=dname;
	}
	public String toString() {
		return did+" "+dname;
	}
	
	
}
class Employeee{
	int eid;
	String ename;
	Department1 dept;
	Employeee(int eid,String ename,Department1 department1){
		this.eid=eid;
		this.ename=ename;
		this.dept=department1;
	}
	public String toString() {
		return eid+" "+ename+" "+dept;
	}
	
}
public class Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e[]= new Employeee[3];
		e[0]=new Employeee(1,"kk",new Department1(2,"Hr1"));
		e[1]=new Employeee(2,"kk",new Department1(2,"Hr1"));
		e[2]=new Employeee(3,"kk",new Department1(2,"Hr1"));
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i]);
		}
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<e.length;i++) {
//			System.out.println("Enter eid");
//			int id=sc.nextInt();
//			System.out.println("Enter ename");
//			String n=sc.next();
//			System.out.println("Enter dept");
//			Department1 d[]=new Department1[3];
//			for(int j=0;j<d.length;j++) {
//				String d1=sc.next();
//				
//			}
//			System.out.println(Arrays.toString(d));
//		}
				

	}

}
