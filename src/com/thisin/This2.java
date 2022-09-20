package com.thisin;
//to invoke current class constructor
public class This2 {
	
	int a;
	int b;
	//int ba;
	This2(){
        
		this(20);
		
		System.out.println("default construtor");
	}
	This2(int ba){
		
		//System.out.println("Parameterized");
		//this.a=a;
		this(10,30);
		
		System.out.println("Parameterized");
	}
    This2(int a,int b){
		
		
		this.a=a;
		this.b=b;
		System.out.println("Parameterized 2");
	}
	
	void display() {
		System.out.println(a+""+b);
	}
	
	
	
	
	public static void main(String [] args) {
		This2 t=new This2();
	//	t.a=30;
		t.display();
		t.a=30;
	}

}
