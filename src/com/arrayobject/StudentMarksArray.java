package com.arrayobject;

import java.util.Arrays;
import java.util.Scanner;

class Student{
	int id;
	String name;
	int marks[];
	Student(int id,String name,int marks[]){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return id+" "+name+" "+Arrays.toString(marks);
	}
	
}
public class StudentMarksArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[]=new Student[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			//System.out.println("Enter marks");
			int mark[]=new int[3];
			for(int j=0;j<mark.length;j++) {
				System.out.println("Enter marks");
			    mark[j]=sc.nextInt();
				
			}
			
			s[i]=new Student(id,name,mark);
			
		}
		System.out.println(Arrays.toString(s));
		///calculate percentage;
	    for(int i=0;i<s.length;i++) {
	    	int m[]=s[i].marks;
	    	int sum=0;
	    	for(int j=0;j<m.length;j++) {
	    		sum=sum+m[j];
	    	}
	    	//System.out.println(sum);
	    	  int per=sum/s.length;
	    	  if(per>60) {
	    		  System.out.println(" "+s[i]+" "+"perc"+per);
	    	  }
	    	  else {
	    		  System.out.println("not pass");
	    	  }
	    }
	  
	    
	    
		

	}

}
