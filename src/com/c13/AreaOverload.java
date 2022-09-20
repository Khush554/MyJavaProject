package com.c13;

public class AreaOverload {
    public void area(int r) {
    	double ans=3.14*r*r;
    	System.out.println(ans);}
    public void area(int h,int b) {
    	double ans=(b*h)/2;
    	System.out.println(ans);}
    public void area(int l,double w) {
    	double ans=l*w;
    	System.out.println(ans);}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOverload a=new AreaOverload();
		a.area(3);
		a.area(3,4);
		a.area(4,4);

	}

}
