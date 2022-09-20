package com.op1;

public class GetterSetterDataGet {
	public void transferAccount(int amount ,GetterSetterExample acc) {
		float bal=acc.getBalance();
		acc.setBalance(bal);
		System.out.println("balance"+ acc.getAccno()+" "+acc.getBalance());
	}
	

	public static void main(String[] args) {
		GetterSetterExample e=new GetterSetterExample();
		e.acceptDetails(1234, "Khushi", 120000.00f);
		
		GetterSetterDataGet a=new GetterSetterDataGet();
		a.transferAccount(1000000, e);
		// TODO Auto-generated method stub

	}

}
