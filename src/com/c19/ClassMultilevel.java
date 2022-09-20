package com.c19;
class Transportation{
	String distance="34km";
	int time;
}
class Train extends Transportation{
	public void show1() {
		//distance="32km";
		time=24;
		System.out.println("Distance by Train="+distance+"Time="+time+"hour");
	}
}
class Aeroplane extends Transportation{
	public void show2() {
		//distance="32km";
		time=2;
		System.out.println("Distance by Aeroplane="+distance+"Time="+time+"hour");
	}
}
class Bus extends Transportation{
	public void show3() {
		//distance="32km";
		time=40;
		System.out.println("Distance by Bus="+distance+"Time="+time+"hour");
	}
}
public class ClassMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t=new Train();
		t.show1();
		
		Aeroplane a=new Aeroplane();
		a.show2();
		
		Bus b=new Bus();
		b.show3();

	}

}
