package com.Assignment1;

public class A8 {
	/*. If you do this Student s1 = new Student(); Student s2 = s1;
	Now print sop(s1) sop(s2) see both reference variables are
	pointing to same location.*/
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
		A8 a=new A8();
		a.acceptdetails(3, "kk", 44, 44, 44);
		a.calculation();
		a.display();
		System.out.println(a);
		A8 a1=a;
		System.out.println(a1);
		

	}

}
