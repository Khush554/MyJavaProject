package com.c14;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=1;
//		System.out.println(a);
//		int sum=0;
//       for(int i=1;i<=10;i++) {
//    	   sum=a+i;
//    	   a=sum;
//    	   System.out.println(sum);
//    	   
//       }
//		int a=3;
//		System.out.println(a);
//		for(int i=1;i<=5;i++) {
//			int t=a*2;
//			a=t;
//			System.out.println(t);
//		}
//		int a=1;
//		int sum;
//		for(int i=1;i<=7;i++) {
//			if(i%2==0) {
//				continue;
//			}
//			else {
//				sum=i*i;
//			}
//			System.out.println(sum);
//		}
		for(int i=1;i<=10;i++) {
			int sum=(i*i)+(i*i*i);
			System.out.println(sum);
		}
		for(int i = 5; i > 0;i-- ){
			int mysteryInt = 100;
			mysteryInt -= i;
		System.out.println(mysteryInt);
		}

	}

}
