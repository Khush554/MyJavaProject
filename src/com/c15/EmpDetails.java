package com.c15;

public class EmpDetails {
	int id;
	int salary;
	String name;
	EmpAddress adr;
	
	EmpDetails(int id,int salary,String name,EmpAddress adr) {
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.adr=adr;
	}
	public void displaydata() {
		//adr.display();
		System.out.println(id+" "+salary+" "+name+" "+adr);
		adr.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EmpDetails e=new EmpDetails(2,233,"kk",new EmpAddress(1,23,"dd","pune"));
       e.displaydata();
//       e.id=2;
//       e.salary=30000;
//       e.name="khus";
//       e.displaydata();
//       EmpAddress a=new EmpAddress();
//      // a.getdata(2, 1234, "ABc", "pune");
//       a.city="pune";
//       a.display();
       
	}

}
