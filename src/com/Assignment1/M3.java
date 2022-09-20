package com.Assignment1;
/*. create another method in Student class setCustomData(int
customId, String customName) These 2 variables are local
variables. Call setCustomData from main method using
Student object and assign any values to customId,
customName from main method. Observe your values are
overwritten in id and name instance variables. Then print
id and name in main method.*/

public class M3 {
	int id;
	String name;
	public void setCustomData(int customid,String customname) {
		/*this.id=customid;
		this.name=customname;*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      M3 m=new M3();
      m.setCustomData(12, "jou");
      System.out.println(m.id+" "+m.name);
	}

}
