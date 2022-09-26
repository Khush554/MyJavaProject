package com.ooptest1;
class Faculty{
	double total_Salary=0;
	double salary;
	
}
class HRA extends Faculty{
	int hra=3000;
}
class DA extends HRA{
	int da=2000;
}
public class MultilevelExample extends DA {
	int bonus;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelExample c=new MultilevelExample();
		c.bonus=3000;
		c.salary=30000;
		c.total_Salary=c.bonus+c.salary+c.da+c.hra;
		System.out.println(c.total_Salary);
		

	}

}
