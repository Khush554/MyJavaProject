package com.oop12;

public class Chainingcons {
	int empid;
	double salary;
	String empname;
	double Grosssalary;
	double hra;
	double da;
    
	 Chainingcons(){
	        this(2,20000,"xyz",8,10);	
	        }
     Chainingcons(int empid,double salary,String empname,double hra,double da){
    	
    	this.empid=empid;
    	this.salary=salary;
    	this.empname=empname;
        this.hra=hra;
        this.da=da;
        }
    
   
      Chainingcons (Chainingcons a){
    	hra=(a.salary*a.hra)/100;
    	da=(a.salary*a.da)/100;
    	a.Grosssalary=a.salary+hra+da;
    	
    	/*System.out.println(da);
    	System.out.println(hra);
    	System.out.println(a.salary);*/
    } 
     public void display() 
     {   
         
     	System.out.println(this.empid+" "+this.salary+" "+this.empname+" "+this.Grosssalary);
     }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chainingcons c=new Chainingcons();
		Chainingcons c1=new Chainingcons(c);
		
		c.display();

	}

}
