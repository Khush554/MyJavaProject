package com.ooptest1;
class Department{}
class Employee
{
	private int id;
    private String name="HI";
    private boolean ismanager;
    private float salary;
    Department dept;
    
    
    public int getId(int id) {return id;}
    public String getName(String name) {return name;}
    public boolean getIsmanager(boolean ismanager) {return true;}
    public float getSalary(float salary) {return salary;}
    public Department getDept(Department dept) {return dept;}
    
    public void setId(int id) {this.id=id;}
    public void setName(String name) {this.name= name;}
    public void setIsmanager(boolean ismanager) {this.ismanager=ismanager;}
    public void setSalary(float salary) {this.salary= salary;}
    public void setDept(Department dept) {this.dept= dept;}
    
    
}
public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
