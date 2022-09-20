package com.oop12;

public class ThreeUseThis {
	
	int orderid;
	String cust_name;
	int status;
	
   ThreeUseThis(int orderid,String cust_name,int status){
	this.orderid=orderid;
	this.cust_name=cust_name;
	this.status=status;
  }	
  ThreeUseThis(){
	  this(12,"Xyz",1);
	  if(status==0) {
		  System.out.println("order is out for delivery");
	  }
	  else {
		  System.out.println("order is deliverd");
	  }
  }	
  public void display() {
	  System.out.println(this.orderid+" "+this.cust_name+" "+this.status);
  }
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeUseThis t=new ThreeUseThis();
		//ThreeUseThis t1=new ThreeUseThis();
		

	}

}
