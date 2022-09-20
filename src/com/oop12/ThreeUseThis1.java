package com.oop12;

public class ThreeUseThis1 {
	 String actorname;
	 String producername;
	 int yearofrelease;
	 double profit;
	 
	 ThreeUseThis1(String actorname,String producername,int yearofrelease,double profit){
		 this.actorname=actorname;
		 this.producername=producername;
		 this.yearofrelease=yearofrelease;
		 this.profit=profit;
	 }	 
	 ThreeUseThis1(){
		 this("ak","kl",1994,30000);
		 display();
	 }	
	// ThreeUseThis1(){}	
	 public void display() {
		 System.out.println(actorname+" "+producername+" "+yearofrelease+" "+profit);
	 }
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeUseThis1 m=new ThreeUseThis1();

	}

}
