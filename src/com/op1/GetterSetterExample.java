package com.op1;

public class GetterSetterExample {
	
	private int accno;
	private String name;
	private float balance;
	
	
	//getter
	public int getAccno(){return accno;}
	public String getName(){return name;}
	public float getBalance(){return balance;}
	//setter
	public void setAccno(int accno) {this.accno=accno;}
	public void setName(String name) {this.name=name;}
	public void setBalance(float balance) {this.balance=balance;}
	
	
	
	public void acceptDetails(int accno,String name,float balance) {
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}


}
