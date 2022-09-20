package com.c19;
class Persons{
	public void show1()
	  {
	  System.out.println("I am a Person");
	  }
}
class Students extends Persons{
	public void show2()
	  {
	  System.out.println("I am a Student");
	  }
}
class Teacher extends Persons{
	public void show3()
	  {
	  System.out.println("I am a Teacher");
	  }
}
class Doctor extends Persons{
	public void show4()
	  {
	  System.out.println("I am a Doctor");
	  }
}
public class ClassHire2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Students student = new Students();
	    student.show1();
	    student.show2();
	    Teacher teacher = new Teacher();
	    teacher.show3();
	    Doctor doctor = new Doctor();
	    doctor.show4();
	   
	   

	}

}
