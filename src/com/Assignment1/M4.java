package com.Assignment1;
/*Show java is pass by value and not by reference. To prove
create object of Student. Pass that object to a method.
Change value of id in that method but dont return
anything. Also print student object hashcode see it will be
same as that of main method object. Now after method is
over in main method simply print id var and see value
would be changed. This is because student reference
points to a memory location. That location is passed as a
value to the local variable of the calling method. Now since
both reference variables are pointing to same location id is
changed and hence the output.*/

public class M4 {
	public void add(int i,int j) {
		i=i+10;
		j=j+20;
		System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
		int i=200;
		int j=100;
		M4 m=new M4();
		m.add(10,30);
		System.out.println(i+" "+j);
	}
}