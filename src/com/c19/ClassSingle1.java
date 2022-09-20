package com.c19;
class Person2
{
  String name="Tk";
  public void show()
  {
    System.out.println("Person class");
  }
}

class Student3 extends Person2
{
 
  String course = "Java Course";
  public void show1()
  {
    System.out.println("I am a Student class"+name+" "+course);
  }
}
public class ClassSingle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s=new Student3();
		s.show();
		s.show1();

	}

}
