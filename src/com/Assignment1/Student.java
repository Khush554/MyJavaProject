package com.Assignment1;
//create student class assign marks and 
//calculate the percentage and print the result 1st class,2nd 
//class etc.

public class Student {
	int math,phy,chem;
	Student(int math,int phy,int chem){
		this.math=math;
		this.phy=phy;
		this.chem=chem;
		calc();
	}
	void calc() {
		int total=((math+phy+chem)*100)/300;
		if(total>60) {
			System.out.println("firstclass");
		}
		else {
			System.out.println("Second");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(90,50,70);

	}

}
