package com.ooptest1;

class Auto{
	public void show(int n) {
		for(int j=1;j<=n;j++) {
		
		int num=j;
		int copy=num;
		//int temp=copy;
		int sq=num*num;
		int count=0;
		int a=1;
		while(num!=0) {
			count++;
			num=num/10;}
		for(int i=1;i<=count;i++) {
			a=a*10;
			
		}
		int l=sq%a;
		//System.out.println(l);
		if(l==j) {
			System.out.println(j);
		}
//		else {
//			System.out.println("not");
//		}
		
		}
	}
	
}
public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a=new Auto();
		a.show(30);

	}

}
