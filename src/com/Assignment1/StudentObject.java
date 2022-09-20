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

public class StudentObject {
	int id;
	void show(StudentObject s) {
		System.out.println(s);
		id=2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentObject s=new StudentObject();
		System.out.println(s);
		//System.out.println(s.show(s));

	}

}
