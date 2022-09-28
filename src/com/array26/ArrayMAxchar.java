package com.array26;

import java.util.Scanner;

public class ArrayMAxchar {
	public static void maxchar(char a[]) {
		char max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]){
			max=a[i];}
		}
		System.out.println( max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter some char");
       char ch[]=new char[5];
       for(int i=0;i<ch.length;i++) {
    	   ch[i]=sc.next().charAt(0);
       }
        ArrayMAxchar.maxchar(ch);
        
	}

}
