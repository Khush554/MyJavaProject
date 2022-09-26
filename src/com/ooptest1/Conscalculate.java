package com.ooptest1;

import java.util.Scanner;

//You have to build a loan calculator. If a single 
//rate of interest is provided then it is a housing loan and loan 
//is principal amount * (100 + rate) If two values are provided then it 
//is a commercial loan and loan
//is principal amount * (value 1 + value 2 +100) [1M]
class LoanCalculator1{
	double principalamount=9000;
	LoanCalculator1(int rate) {
		
		double total=principalamount*(100+rate);
		System.out.println(total+"housing loan");
	}
	LoanCalculator1(int value1,int value2) {
		
		double total=principalamount*(value1+value2+100);
		System.out.println(total+"commercial loan");
	}
}
public class Conscalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LoanCalculator1 l=new LoanCalculator1(200);
		LoanCalculator1 l1=new LoanCalculator1(20,30);
		

	}

}
