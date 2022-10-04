package com.array26;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
	public static void arrevenodd(int a[]) {
		int count=0;
		int even[]= new int[a.length];
		int odd[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[i]=a[i];
				
			}
			else{
				odd[i]=a[i];
			}
			//System.out.println(Arrays.toString(even));
		}
		
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some numbers");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		EvenOdd .arrevenodd(a);
		
	
		}

	}


