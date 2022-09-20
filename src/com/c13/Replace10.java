package com.c13;

import java.util.Scanner;

public class Replace10 {
	
	public  int reversNum(int n)
	{   
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int org=num;
     int rem,ans=0,temp=1;
     int t=0;
     
     while(num>0) {
    	 rem=num%10;
    	 System.out.println(rem+".......");
    	 if(rem==1) {
    		 rem=0;
    	 }
    	//System.out.print(" "+rem);
    	
       //  ans=ans*10+rem;
    	//  ans=temp*rem+ans;
    	  System.out.println("////"+ans);
    	 // temp=temp*10;
    	  t=t*10+rem;
    	
    	 
          num=num/10;
          
     
     }
    	 
    System.out.println(new Replace10().reversNum(t) ); 
	}

}
