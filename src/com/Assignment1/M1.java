package com.Assignment1;
/*add method displayData inside Student class change
values of id name in that method & also print the changed
values in same method. Call displayData method from
main method and see the output. Observe displayData can
only be called by creating object of Student*/
public class M1 {
       int id =2;
       String name="kk";
       public void display() {
    	   id=3;
    	   name="lk";
    	   System.out.println(id+ " "+name);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 m=new M1();
		m.display();

	}

}
