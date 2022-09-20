package com.op1;

public class Student {
	 int id;
	 String name;
	 int physics,chemistry,math;
     int percentage;
	
	 public void acceptdetails(int i,String n ,int p,int c,int m) {
		 id=i;
		 name=n;
		 physics=p;
		 chemistry=c;
		 math=m;
		
		 
	 }
	public void calculation() 
	{
    //int total=physics+chemistry+math;
     percentage=((physics+chemistry+math)*100)/300;

				
	}
	public void display() {
		System.out.println(id+" "+name+" "+"physics="+physics+"chemistry= "+chemistry+"math="+math+"percentage"+percentage);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.acceptdetails(2,"Kk", 30, 40, 50);
		s.calculation();
		s.display();
		Student s1=new Student();
		s1.acceptdetails(2,"Kk", 80, 0, 50);
		s1.calculation();
		s1.display();
		
		

	}

}
