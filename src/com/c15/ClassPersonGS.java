package com.c15;
class Addres{
	private int pincode;
	private String city;
	
	public int getPincode() {
		return pincode;
	}
	public String getCity() {
		return city;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public void setCity(String city) {
		this.city=city;
	}
	
	
}
public class ClassPersonGS {
	int id;
	String name;
	Addres adr;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Addres getAdr() {
		return adr;
	}
   public void setId(int id) {
	   this.id=id;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public void setAddres(Addres adr) {
	   this.adr=adr;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPersonGS c=new ClassPersonGS();
		c.setId(2);
		c.setName("khushi");
		//Addres c1=new Addres();
		//c1.setCity("fsd");
		c.setAddres(new Addres());
		c.getAdr().setCity("pune");
		c.getAdr().setPincode(2334);
		System.out.println(c.getId()+" "+c.getName()+" "+c.getAdr().getCity()+" "+c.getAdr().getPincode());
		
		

	}

}
