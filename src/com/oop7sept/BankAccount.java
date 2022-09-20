package com.oop7sept;

public class BankAccount {
	int id;
	String type;
	double balance;
	double deposit;
	double withdraw;
	double total;
	public void acceptdetails(int id,String type,double balance,double deposit,double withdraw) {
		this.id=id;
		this.type=type;
		this.balance=balance;
		this.deposit=deposit;
		this.withdraw=withdraw;
	}
	public void display() {
		System.out.println("id="+id+" "+"type="+type+" "+"balance="+balance+" "
				+ ""+"deposit="+deposit+" "+"withdraw="+withdraw);
	}
	public void deposit() {
	 total=balance+deposit;
	// System.out.println(total);
	 balance=total;
	 //System.out.println(balance);

		
	}
	public void withdraw() {
		total=balance-withdraw;
		balance=total;
		 //System.out.println(total);

	}
	public void balance() {
		System.out.println("balance="+balance);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.acceptdetails(2, "saving",20,30,10);
		b.display();
		b.deposit();
		b.withdraw();
		b.balance();

	}

}
