package com.c14;

public class AvgPrime {
	public double avg() {
		int sum=0;
		int count=0;
		int avg=0;
		for(int i=1;i<=20;i++) {
		//int num=31;
		
		boolean isprime=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isprime=false;
				break;
			}
		}
		
		
		if(isprime==true && i!=1) {
			count++;
			//System.out.println("t");
			//System.out.println(i);
			sum=sum+i;
			
		}
		}
		System.out.println(sum);
		//System.out.println(count);
		avg=sum/count;
		
	
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvgPrime p=new AvgPrime();
		p.avg();
		System.out.println(p.avg());



}
}