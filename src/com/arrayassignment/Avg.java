package com.arrayassignment;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[5];
     int sum=0,avg;
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<a.length;i++) {
    	 a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++) {
    	 sum=sum+a[i];
    	 
     }
     avg=sum/a.length;
     System.out.println(avg);
     
	}

}
